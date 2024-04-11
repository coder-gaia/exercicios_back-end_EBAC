/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your age: ");
        int age = s.nextInt();
        System.out.println("You are " + age + " years old.");
    }

}
