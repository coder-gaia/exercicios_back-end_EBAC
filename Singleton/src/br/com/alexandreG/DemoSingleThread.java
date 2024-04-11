/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class DemoSingleThread {

    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("Foo");
        Singleton singleton_2 = Singleton.getInstance("Fighters");

        System.out.println(singleton.value);
        System.out.println(singleton_2.value);
    }
}
