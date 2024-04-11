/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Adapter;

import java.io.File;

public class DropBoxAdapter implements Persistencia{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox){
        this.dropBox = dropBox;
    }
    @Override
    public void gravar(File file) {
        dropBox.upload(file.getAbsoluteFile());
    }

    @Override
    public File read(String path) {
        DropBoxFile file = new DropBoxFile(path);
        return new File(file.getLocalPath());
    }
}
