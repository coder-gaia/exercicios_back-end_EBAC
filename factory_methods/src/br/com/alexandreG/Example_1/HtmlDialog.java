/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Example_1;

import br.com.alexandreG.Example_1.Button;
import br.com.alexandreG.Example_1.Dialog;
import br.com.alexandreG.Example_1.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
