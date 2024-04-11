/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Fish extends Animal{

    private String scaleColor;

    public void makeBubblle(){
        System.out.println("Making bubbles");
    }
    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void feed() {
        System.out.println("Eating substances");
    }

    @Override
    public void makeSound() {
        System.out.println("Fishes don't make sound");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
