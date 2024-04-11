/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Reptile extends Animal{

    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Crawling");
    }

    @Override
    public void feed() {
        System.out.println("Eating vegetables");
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile sound");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
