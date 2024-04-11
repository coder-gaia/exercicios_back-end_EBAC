/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG.forwhile;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            System.out.println("Line: " + i);
            values.add(i);
        }

        for (Integer i: values){
            System.out.println("Line: " + i);
        }

        values.forEach(i -> System.out.println("Line: " + i));

    }
}
