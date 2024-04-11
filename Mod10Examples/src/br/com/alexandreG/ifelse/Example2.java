/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.ifelse;

public class Example2 {
    public static void main(String[] args){
        int result = 6;
        if (result > 1 && result < 5){
            System.out.println("Between 1 and 5!");
        } else if (result >=5 && result < 8) {
            System.out.println("Between 5 and 8!");
        } else{
            System.out.println("The conditions don't meet.");
        }
    }
}
