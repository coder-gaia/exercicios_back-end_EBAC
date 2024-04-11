/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class DemoMultiThread {

    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" +
                "RESULT:" + "\n");


        Thread threadFoo = new Thread(new threadFoo());
        Thread threadFighters = new Thread(new threadFighters());
        threadFoo.start();
        threadFighters.start();

    }

    static class threadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class threadFighters implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
