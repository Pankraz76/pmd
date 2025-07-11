/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.bestpractices.missingoverride;

public enum EnumToString {
    sub_EnumClazz {
        // missing @Override
        @Override public String toString() {
            return "test";
        }

        // missing @Override
        @Override public void notOverride() {
            System.out.println("test");
        }
    };

    // missing @Override
    @Override public String toString() {
        return "test";
    }

    public void notOverride() {
        System.out.println("test");
    }
}
