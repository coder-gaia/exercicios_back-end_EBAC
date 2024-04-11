/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Example_2;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Wof! Wof");
    }

    public void sipWater(){
        System.out.println("schlop schlop schlop");
    }
}
