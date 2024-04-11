/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class SingletonProps {

    private static SingletonProps singleton;
    private String value;

    private SingletonProps(String value){
        this.value = value;
    }

    public static SingletonProps getInstance(String value){
        if(singleton == null){
            singleton = new SingletonProps(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
