/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Observer;

public class Demo {

    public static void main(String[] args){
        Journalist journalist = new Journalist();
        journalist.add(new TV());
        journalist.notifyAll("But Professor, I can't learn through the Ctrl C + Ctrl Z method!");
    }
}
