/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Executer {
    public static void main(String[] args){
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Reptile reptile = new Reptile();
        Kangaroo kangaroo = new Kangaroo();
        Dog dog = new Dog();
        Turtle turtle = new Turtle();

        mammal.setWeight(35.5f);
        mammal.setFurColor("Brown");
        mammal.feed();
        mammal.move();
        mammal.makeSound();

        bird.move();
        fish.move();
        reptile.move();

        kangaroo.move();
        kangaroo.useBag();

        dog.buryBone();
        dog.wagtail();
        dog.makeSound();

        turtle.move();




    }
}
