/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.lang.java.symbols.JTypeParameterOwnerSymbol;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * A symbol declaration, whose symbol can declare type parameters.
 *
 * @author Clément Fournier
 */
public interface TypeParamOwnerNode extends SymbolDeclaratorNode {

    @Override
    JTypeParameterOwnerSymbol getSymbol();

    /**
     * Returns the type parameter declaration of this node, or null if
     * there is none.
     */
    default @Nullable ASTTypeParameters getTypeParameters() {
        return firstChild(ASTTypeParameters.class);
    }
}
