/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.TemplateMethods;

public class Lawyer extends Worker{

    @Override
    public void executeRoutine() {
        System.out.println("I'm on vacation!!");
    }

    @Override
    protected void work() {
        System.out.println("The laywer is at the court.");
    }

    @Override
    protected void getBackHome() {
        System.out.println("The laywer is getting back home");
    }

    @Override
    protected void goToWork() {
        System.out.println("The laywer is going to work");
    }

    @Override
    protected void initiateRoutine() {
        System.out.println("Laywers routine is just as the same as everybody's.");
    }

    @Override
    protected void getUp() {
        System.out.println("The Laywer is getting up.");
    }
}
