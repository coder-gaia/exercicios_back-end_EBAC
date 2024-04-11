/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

import java.util.Scanner;

public class MultiplicationTableDoWhile {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String answer = "";

        do{
            System.out.println("Insert a number to be seen in the multiplication table: ");
            int number = s.nextInt();

            for (int i = 1; i <= 10; i++){
                System.out.println(number + " X " + i + " = " + number * i);
            }

            System.out.println("Do you wish to see another multiplication table?");
            answer = s.next();
        }while (answer.equalsIgnoreCase("Yes"));

        System.out.println("Hope you've enjoyed!");
    }
}
