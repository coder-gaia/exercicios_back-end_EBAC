/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

import java.util.Scanner;

public class ScannerExample2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String name = s.nextLine();

        System.out.println("Insert your height: ");
        Double height = s.nextDouble();

        System.out.println(name + " is " + height + " cm ");
    }
}
