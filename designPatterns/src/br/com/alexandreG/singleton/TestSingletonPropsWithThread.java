/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class TestSingletonPropsWithThread {

    public static void main(String[] args){
        Thread thread_1 = new Thread(new ThreadFoo());
        Thread thread_2 = new Thread(new ThreadBar());
        thread_1.start();
        thread_2.start();
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance("test");
            System.out.println(singletonSynchronized.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonSynchronized singletonSynchronized = SingletonSynchronized.getInstance("something");
            System.out.println(singletonSynchronized.getValue());
        }
    }
}
