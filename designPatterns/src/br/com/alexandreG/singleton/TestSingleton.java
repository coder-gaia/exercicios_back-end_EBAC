/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class TestSingleton {

    public static void main (String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
