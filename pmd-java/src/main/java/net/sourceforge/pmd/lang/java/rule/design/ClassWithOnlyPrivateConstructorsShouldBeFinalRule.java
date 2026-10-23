/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.design;

import static net.sourceforge.pmd.lang.java.ast.ModifierOwner.Visibility.V_PRIVATE;

import net.sourceforge.pmd.lang.ast.NodeStream;
import net.sourceforge.pmd.lang.java.ast.ASTAnnotation;
import net.sourceforge.pmd.lang.java.ast.ASTAssignableExpr.ASTNamedReferenceExpr;
import net.sourceforge.pmd.lang.java.ast.ASTClassDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTConstructorDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTExpression;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.JModifier;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRulechainRule;
import net.sourceforge.pmd.lang.java.types.TypeTestUtil;

public class ClassWithOnlyPrivateConstructorsShouldBeFinalRule extends AbstractJavaRulechainRule {

    public ClassWithOnlyPrivateConstructorsShouldBeFinalRule() {
        super(ASTClassDeclaration.class);
    }

    @Override
    public Object visit(ASTClassDeclaration node, Object data) {
        if (node.isRegularClass()
            && !node.hasModifiers(JModifier.FINAL)
            && !node.isAnnotationPresent("lombok.Value")
            && !node.isAnnotationPresent("lombok.experimental.UtilityClass")
            && hasOnlyPrivateCtors(node)
            && hasNoSubclasses(node)) {
            asCtx(data).addViolation(node);
        }
        return null;
    }

    /**
     * Returns the lombok annotations that generate a constructor.
     * {@code access = AccessLevel.NONE} means that no constructor is generated.
     */
    private static NodeStream<ASTAnnotation> getLombokConstructorAnnotations(ASTClassDeclaration node) {
        return node.getDeclaredAnnotations()
                   .filter(it -> TypeTestUtil.isA("lombok.NoArgsConstructor", it)
                       || TypeTestUtil.isA("lombok.RequiredArgsConstructor", it)
                       || TypeTestUtil.isA("lombok.AllArgsConstructor", it))
                   .filterNot(it -> hasAccessLevel(it, "NONE"));
    }

    private static boolean isPrivateLombokConstructor(ASTAnnotation annotation) {
        return hasAccessLevel(annotation, "PRIVATE")
            // "If set, the generated constructor will be private, and an additional static 'constructor'
            // is generated with the same argument list that wraps the real constructor."
            // See javadoc of staticName in lombok.NoArgsConstructor, RequiredArgsConstructor, AllArgsConstructor
            || annotation.getFlatValue("staticName")
                         .filterIs(ASTExpression.class)
                         .any(it -> it.getConstValue() instanceof String && !((String) it.getConstValue()).isEmpty());
    }

    private static boolean hasAccessLevel(ASTAnnotation annotation, String accessLevel) {
        return annotation.getFlatValue("access")
                         .filterIs(ASTNamedReferenceExpr.class)
                         .any(ref -> accessLevel.equals(ref.getName()));
    }

    private boolean hasNoSubclasses(ASTClassDeclaration klass) {
        return klass.getRoot()
                    .descendants(ASTTypeDeclaration.class)
                    .crossFindBoundaries()
                    .none(it -> doesExtend(it, klass));
    }

    private boolean doesExtend(ASTTypeDeclaration sub, ASTClassDeclaration superClass) {
        return sub != superClass && TypeTestUtil.isA(superClass.getTypeMirror().getErasure(), sub);
    }

    private boolean hasOnlyPrivateCtors(ASTClassDeclaration node) {
        NodeStream<ASTConstructorDeclaration> ctors = node.getDeclarations(ASTConstructorDeclaration.class);
        NodeStream<ASTAnnotation> lombokCtors = getLombokConstructorAnnotations(node);
        return ctors.all(it -> it.getVisibility() == V_PRIVATE)
            && lombokCtors.all(ClassWithOnlyPrivateConstructorsShouldBeFinalRule::isPrivateLombokConstructor)
            && (node.getVisibility() == V_PRIVATE // then the default ctor is private
            || ctors.nonEmpty()
            || lombokCtors.nonEmpty());
    }

}
