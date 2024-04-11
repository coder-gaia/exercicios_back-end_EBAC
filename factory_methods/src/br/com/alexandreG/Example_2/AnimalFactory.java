/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Example_2;

public class AnimalFactory {

    public Animal createAnimal(String type){
        if (type.equalsIgnoreCase("dog")){
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}
