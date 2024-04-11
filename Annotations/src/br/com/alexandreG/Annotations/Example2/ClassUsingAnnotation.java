/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Annotations.Example2;


@FirstAnnotation(value = "Alexandre", neighborhood = "Ronda", houseNumber = 100)
public class ClassUsingAnnotation {
    @FirstAnnotation(value = "Gaia", neighborhood = {"Test", "Test_2"}, houseNumber = 200, values = 400d)
    private String name;
    
    @FirstAnnotation(value = "", neighborhood = {}, houseNumber = 0L)
    public ClassUsingAnnotation() {}
}
