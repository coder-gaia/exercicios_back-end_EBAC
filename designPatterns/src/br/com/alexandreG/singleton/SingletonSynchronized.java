/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.singleton;

public class SingletonSynchronized {

        private static SingletonSynchronized singleton;
        private String value;

        private SingletonSynchronized(String value){
            this.value = value;
        }

        public static synchronized SingletonSynchronized getInstance(String value){
            if(singleton == null){
                singleton = new SingletonSynchronized(value);
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
