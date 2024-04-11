/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.List;


import java.util.Collections;
import java.util.List;

public class LinkedList {

    public static void main(String[] args){
        simpleList();
        ascendingList();
    }

    private static void simpleList(){
        System.out.println("****** simpleList ******");

        List<String> list = new java.util.LinkedList<>();
        list.add("Robert");
        list.add("Hagrid");
        list.add("Alexandre");
        System.out.println(list);
        System.out.println("");

        list.remove(0);
        System.out.println(list);
        boolean contain = list.contains("Robert");
        System.out.println(contain);

        for(String name: list){
            System.out.println(name);
        }

        System.out.println(list.get(1));
    }

    private static void ascendingList(){
        System.out.println("****** ascendingList ******");

        List<String> list = new java.util.LinkedList<>();
        list.add("Robert");
        list.add("Hagrid");
        System.out.println("non ordered " + list);
        Collections.sort(list);
        System.out.println("ordered " + list);
    }
}
