/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Example_1;

import br.com.alexandreG.Example_1.Button;

public abstract class Dialog {

    public void renderWindow(){

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

