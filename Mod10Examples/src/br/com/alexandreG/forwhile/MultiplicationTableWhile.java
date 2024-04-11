/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

import java.util.Objects;
import java.util.Scanner;

public class MultiplicationTableWhile {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Do you wanna see a number in the multiplication table?");
        String answer = s.next();

        while(answer.equalsIgnoreCase("Yes")){
            System.out.println("insert a number: ");
            int number = s.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(number + " X " + i + " = " + number * i);
            }

            System.out.println("Do you wish to see another multiplication table?");
            answer = s.next();
        }

        System.out.println("Hope you've enjoyed!");
    }

}
