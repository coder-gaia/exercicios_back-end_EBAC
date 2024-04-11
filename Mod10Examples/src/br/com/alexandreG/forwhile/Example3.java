/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

public class Example3 {
    public static void main(String[] args){
        for (int counter = 1; counter <= 100; counter++){
            if (counter % 5 !=0)
                continue;
            System.out.println("Counter: " + counter);
        }
    }
}
