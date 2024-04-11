/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.TemplateMethods;

public abstract class Worker {

    public void executeRoutine(){
        initiateRoutine();
        getUp();
        goToWork();
        work();
        getBackHome();
    }

    protected abstract void work();
    protected void getBackHome() {
        System.out.println("Heading back home.");
    }
    protected void goToWork() {
        System.out.println("Going to work.");
    }
    protected void initiateRoutine(){
        System.out.println("Starting routine..");
    }
    protected void getUp(){
        System.out.println("Getting up..");
    }
}
