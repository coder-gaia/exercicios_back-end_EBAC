/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

public class Example2 {
    public static void main(String[] args){
        for (int counter = 1; counter <= 1000; counter++){
            System.out.println("This is the number: " + counter);
            if(counter == 10){
                break;
            }
        }
    }
}
