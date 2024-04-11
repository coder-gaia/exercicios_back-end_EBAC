/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.interfaces;

public interface ICar {

    public void drive();
    default void stop() {
        System.out.println("The car has stopped.");
    }
}
