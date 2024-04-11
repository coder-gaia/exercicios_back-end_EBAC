/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.TemplateMethods;

public class Cop extends Worker{
    @Override
    protected void work() {
        System.out.println("The police officer prepares his gear.");
    }

    @Override
    protected void getUp() {
        System.out.println("The police officer wakes up at 8PM");
    }
}
