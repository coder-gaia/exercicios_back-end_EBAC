/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.switchcase;

import java.util.Scanner;

public class AgeExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your age: ");
        int age = s.nextInt();

        String ageSt = getAge(age);
        System.out.println(ageSt);

    }

    public static String getAge(int age){
        String result;

        switch (age){
            case 0:
            case 5:
                result = "You're a baby.";
                break;
            case 6:
            case 10:
                result = "You're a kid.";
                break;
            case 11:
            case 18:
                result = "You're an adolescent.";
                break;
            default:
                result = "You're an adult";
        }
        return result;
    }
}
