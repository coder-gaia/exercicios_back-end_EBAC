/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.interfaces;

public interface IPen {

    void write(String text);
    String getColor();

    default void optionalMethod(){
        System.out.println("Optional method");
    }
}