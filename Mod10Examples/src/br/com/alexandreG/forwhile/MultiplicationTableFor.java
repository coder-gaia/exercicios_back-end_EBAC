/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

import java.util.Scanner;

public class MultiplicationTableFor {

    public static void main( String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert a number to be seen in the multiplication table: ");
        int number = s.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
