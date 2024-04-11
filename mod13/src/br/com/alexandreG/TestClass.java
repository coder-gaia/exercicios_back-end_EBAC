package br.com.alexandreG;

import br.com.alexandreG.interfaces.*;

public class TestClass {
    public static void main(String[] args){

        IPen pen = new BallpointPen();
        pen.write("Hello, Alexandre");
        pen.optionalMethod();
        System.out.println("Pen's color: " + pen.getColor());

        IPen chalk = new Chalk();
        chalk.write("Hello, Alexandre");
        pen.optionalMethod();
        System.out.println("Chalk's color: " + chalk.getColor());

        IPen pencil = new Pencil();
        pencil.write("Hello, Alexandre");
        pen.optionalMethod();
        System.out.println("Pencil's color: " + pencil.getColor());


        ICar car = new TourCar();
        car.drive();
        car.stop();

        ICar truck = new Truck();
        truck.drive();
        truck.stop();
    }
}
