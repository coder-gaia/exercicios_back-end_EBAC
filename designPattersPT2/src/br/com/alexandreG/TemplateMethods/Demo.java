/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.TemplateMethods;

public class Demo {
    public static void main(String[] args) {
        Worker fireman = new Fireman();
        Worker policeOficer = new Cop();
        Worker laywer = new Lawyer();


        fireman.executeRoutine();
        System.out.println("#######################");
        policeOficer.executeRoutine();
        System.out.println("#######################");
        laywer.executeRoutine();
    }
}
