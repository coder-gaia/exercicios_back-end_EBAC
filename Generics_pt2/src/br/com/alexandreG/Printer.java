/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Printer<T, V> {
    private T thingToPrint;
    private V otherThingToPrint;

    public Printer(T thingToPrint, V otherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.otherThingToPrint = otherThingToPrint;
    }


    public T getThingToPrint() {
        return thingToPrint;
    }

    public V getOtherThingToPrint() {
        return otherThingToPrint;
    }
}
