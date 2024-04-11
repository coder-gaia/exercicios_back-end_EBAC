/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer;

public class TV implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Receiving the news through the TV." + subject.toString());
    }
}
