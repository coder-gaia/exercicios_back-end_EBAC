/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Dog extends Mammal{

    @Override
    public void makeSound(){
        System.out.println("Wof! Wof! Wof!");
    }

    public void buryBone(){
        System.out.println("Burying bone");
    }

    public void wagtail(){
        System.out.println("Wagging tail");
    }
}
