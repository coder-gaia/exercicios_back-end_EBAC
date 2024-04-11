/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Example_2;

public class Executer {

    public static void main(String[] args){
        AnimalFactory factory = new AnimalFactory();

        Animal animal = factory.createAnimal("Dog");
        animal.makeSound();

        if (animal instanceof Dog) {
            Dog cachorro = (Dog) animal;
            cachorro.sipWater();
        } else {
            System.out.println("error");
        }

        Animal animal1 = factory.createAnimal("Cat");
        animal1.makeSound();
    }
}
