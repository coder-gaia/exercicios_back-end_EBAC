/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.interfaces;

public class Pencil implements IPen{
    @Override
    public void write(String text) {
        System.out.println("Writing the value: " + text + " in the class " + getClass().getSimpleName());
    }

    @Override
    public String getColor() {
        return "Black";
    }
}
