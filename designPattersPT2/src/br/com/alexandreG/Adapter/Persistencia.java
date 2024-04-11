/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Adapter;

import java.io.File;

public interface Persistencia {

    public void gravar(File file);

    public File read(String path);
}
