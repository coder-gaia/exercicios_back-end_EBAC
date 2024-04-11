/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String file = "test.txt";

        DropBox dropBox = new DropBox();
        Persistencia archives = new DropBoxAdapter(dropBox);
        archives.gravar(new File(file));

    }
}
