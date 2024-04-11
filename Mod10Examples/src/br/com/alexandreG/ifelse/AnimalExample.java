/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.ifelse;

import java.util.Scanner;

public class AnimalExample {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert an animal's name: ");
        String text = s.next();
        String animal = exampleOfIf(text);
        System.out.println(animal);
    }

    public static String exampleOfIf (String animal){
        String result;

        if(animal.equalsIgnoreCase("Dog") || animal.equalsIgnoreCase("Cat")){
            result = "Domestic animal";
        } else if (animal.equalsIgnoreCase("Tiger")) {
            result = "Wild animal";
        }else{
            result = "Unknown animal";
        }

        return result;
    }
}

