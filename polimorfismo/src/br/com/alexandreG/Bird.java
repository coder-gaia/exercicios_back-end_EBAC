/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Bird extends Animal{

    private String featherColor;

    private void makeNest(){
        System.out.println("Nest made");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }

    @Override
    public void feed() {
        System.out.println("Eating fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }
}
