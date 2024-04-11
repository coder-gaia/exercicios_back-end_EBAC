/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class TestSingletonSynchronized {

    public static void main(String[] args){
        Thread thread_1 = new Thread(new ThreadFoo());
        Thread thread_2 = new Thread(new ThreadBar());
        thread_1.start();
        thread_2.start();
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            SingletonProps singletonProps = SingletonProps.getInstance("something");
            System.out.println(singletonProps.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonProps singletonProps = SingletonProps.getInstance("something else");
            System.out.println(singletonProps.getValue());
        }
    }
}
