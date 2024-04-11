/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class TestSingletonProps {

    public static void main(String[] args){
        SingletonProps singletonProps = SingletonProps.getInstance("test");
        SingletonProps singletonProps1 = SingletonProps.getInstance("test1");
        System.out.println(singletonProps);
        System.out.println(singletonProps1);
    }
}
