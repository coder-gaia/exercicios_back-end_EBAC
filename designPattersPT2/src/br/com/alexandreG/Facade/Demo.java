/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Facade;

public class Demo {
    public static void main(String[] args){
        IApartmentService apt = new ApartmentService();
        apt.registerApartment(new Apartment("Address_1", 1l));
        System.out.println("Apartment infos:" + apt);
    }
}
