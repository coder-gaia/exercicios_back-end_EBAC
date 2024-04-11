/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.interfaces;

public class Truck implements ICar{
    @Override
    public void drive() {
        System.out.println("The truck has started.");
    }

    @Override
    public void stop() {
        System.out.println("The truck has stopped.");
    }
}
