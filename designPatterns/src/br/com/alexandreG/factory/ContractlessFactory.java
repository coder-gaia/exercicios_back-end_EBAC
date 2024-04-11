/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public class ContractlessFactory extends Factory{
    @Override
    Vehicle retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Ferrari(100, "Full", "Yellow");
        } else {
            return null;
        }
    }
}
