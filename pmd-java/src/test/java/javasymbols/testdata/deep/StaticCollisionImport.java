/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package javasymbols.testdata.deep;

import javasymbols.testdata.StaticNameCollision;

import static javasymbols.testdata.Statics.oha;


public class StaticCollisionImport {

    StaticNameCollision.Ola o;

    static {
        oha();
    }

}
