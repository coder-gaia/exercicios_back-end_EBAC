/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.ifelse;

import java.util.Scanner;

public class ExampleConsole {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Insert your age: ");

        int result = s.nextInt();

        if (result >= 18){
            System.out.println("You're allowed to get in");
        } else if (result > 1 && result <= 14) {
            System.out.println("You're a kid! You shouldn't be here at all!");
        } else{
            System.out.println("You're a minor. You cannot get in!");
        }
    }
}
