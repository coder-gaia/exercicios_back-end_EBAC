/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Main {

    public static void main(String[] args) {
        Printer<String, Integer> printer_string = new Printer<>("Anything", 10);
        Printer<Integer, Boolean> printer_integer = new Printer<>(100, false);
        Printer<Boolean, Float> printer_boolean = new Printer<>(true, 10.2f);
        Printer<Double, String> printer_double = new Printer<>(1.0, "testing");

        System.out.println("1st - " + printer_string.getThingToPrint() + " " + printer_string.getOtherThingToPrint());
        System.out.println("2nd - " + printer_integer.getThingToPrint() + " " +printer_string.getOtherThingToPrint());
        System.out.println("1rd - " + printer_boolean.getThingToPrint() + " " + printer_string.getOtherThingToPrint());
        System.out.println("1th - " + printer_double.getThingToPrint() + " " + printer_string.getOtherThingToPrint());


/*        shout("HEEEEEEEEEEEEEEEEY", true);
        shout(2004, 1.0);*/
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!!!!");
        System.out.println(otherThingToShout + "?????");
    }
}
