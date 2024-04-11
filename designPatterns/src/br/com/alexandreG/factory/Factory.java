/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public abstract class Factory {

    public Vehicle create(String requestedGrade) {
        Vehicle car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }
    private Vehicle prepareCar(Vehicle car){
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }
    abstract Vehicle retrieveCar(String requestedGrade);
}
