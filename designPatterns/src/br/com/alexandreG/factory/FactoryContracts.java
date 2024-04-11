/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public class FactoryContracts extends Factory{
    @Override
    Vehicle retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Ferrari(100, "full", "Red");
        } else {
            return null;
        }
    }
}
