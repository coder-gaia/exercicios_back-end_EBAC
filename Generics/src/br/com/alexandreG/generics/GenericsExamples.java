/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.generics;

import br.com.alexandreG.fruite.Apple;
import br.com.alexandreG.fruite.Fruite;
import br.com.alexandreG.fruite.Watermellon;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alexandre");
        list.add("Gaia");
        //print(list);

        List<Long> listLong = new ArrayList<>();
        listLong.add(1L);
        listLong.add(100L);
        //print(listLong);

        String st = getFirstItem(list);
        System.out.print(st);

        Long number = getFirstItem(listLong);
        System.out.print(number);

        System.out.println(" ");
        print2(list);
        print2(listLong);

        List<Fruite> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Watermellon());
        printFruites(fruits);
    }

    //ctrl + shift + / to comment multiple lines.

    // '?' is a wild card
    public static void print2(List<?> list) {
        for (Object s : list) {
            System.out.println("The '?' receives anything, number, string etc.." + s);
        }
    }

    public static <T> void print(List<T> list){
        for(T st : list){
            System.out.print(st);
        }
    }

    public static <T> void printFruites(List<? extends Fruite> list){
        for(Fruite fruite : list){
            System.out.println(fruite);
        }
    }

    public static <T> T getFirstItem(List<T> list){
        return list.get(0);
    }
}
