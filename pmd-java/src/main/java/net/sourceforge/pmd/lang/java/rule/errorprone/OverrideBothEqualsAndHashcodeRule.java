/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.errorprone;

import net.sourceforge.pmd.lang.java.ast.ASTAnonymousClassDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTClassDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTRecordDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTTypeDeclaration;
import net.sourceforge.pmd.lang.java.ast.internal.JavaAstUtils;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRulechainRule;
import net.sourceforge.pmd.lang.java.types.TypeTestUtil;

public class OverrideBothEqualsAndHashcodeRule extends AbstractJavaRulechainRule {

    public OverrideBothEqualsAndHashcodeRule() {
        super(ASTClassDeclaration.class,
                ASTRecordDeclaration.class,
                ASTAnonymousClassDeclaration.class);
    }

    private void visitTypeDecl(ASTTypeDeclaration node, Object data) {
        boolean isComparable = TypeTestUtil.isA(Comparable.class, node);
        ASTMethodDeclaration equalsMethod = null;
        ASTMethodDeclaration hashCodeMethod = null;

        for (ASTMethodDeclaration m : node.getDeclarations(ASTMethodDeclaration.class)) {
            if (JavaAstUtils.isEqualsMethod(m)) {
                equalsMethod = m;
                if (hashCodeMethod != null && !isComparable) {
                    break; // shortcut for non-Comparable types
                }
            } else if (JavaAstUtils.isHashCodeMethod(m)) {
                hashCodeMethod = m;
                if (equalsMethod != null && !isComparable) {
                    break; // shortcut for non-Comparable types
                }
            }
        }

        if (isComparable) {
            // For Comparable types, we need both equals and hashCode
            if (equalsMethod == null) {
                // Report violation on the class/record declaration
                asCtx(data).addViolation(node);
            } else if (hashCodeMethod == null) {
                asCtx(data).addViolation(equalsMethod);
            }
        } else {
            // Original behavior for non-Comparable types
            if (hashCodeMethod != null ^ equalsMethod != null) {
                asCtx(data).addViolation(equalsMethod == null ? hashCodeMethod : equalsMethod);
            }
        }
    }

    @Override
    public Object visit(ASTAnonymousClassDeclaration node, Object data) {
        visitTypeDecl(node, data);
        return null;
    }

    @Override
    public Object visit(ASTClassDeclaration node, Object data) {
        if (node.isInterface()) {
            return null;
        }
        visitTypeDecl(node, data);
        return null;
    }

    @Override
    public Object visit(ASTRecordDeclaration node, Object data) {
        visitTypeDecl(node, data);
        return null;
    }
}
