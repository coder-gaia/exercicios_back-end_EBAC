/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public abstract class Vehicle {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Vehicle(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + " engine has been started, and is ready to ride " + horsePower + " horsepowers.n" );
    }
    public void clean(){
        System.out.println("The vehicle has been cleaned, and the " + color.toLowerCase() + " is as though as it was a brand new one!");
    }
    public void mechanicCheck(){
        System.out.println("The vehicle has been checked and it's good to go!");
    }
    public void fuelCar(){
        System.out.println("The vehicle has its tank " + fuelSource.toLowerCase());
    }
}
