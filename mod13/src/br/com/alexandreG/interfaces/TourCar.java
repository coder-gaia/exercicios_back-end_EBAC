/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.interfaces;

public class TourCar implements ICar{

    @Override
    public void drive() {
        System.out.println("The car has started.");
    }
}
