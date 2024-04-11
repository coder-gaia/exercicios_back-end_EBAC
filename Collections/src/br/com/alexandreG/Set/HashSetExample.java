/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Set;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo ******");
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
    }

    /**
     * does not repeat values in the list
     */
    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> list = new HashSet<>();
        list.add("João da Silva");
        list.add("Antonio Sousa");
        list.add("Lúcia Ferreira");
        list.add("João da Silva");
        System.out.println(list);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        Set<String> list = new HashSet<String>();
        list.add("João da Silva");
        list.add("Antonio Sousa");
        list.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(list);
        System.out.println("");
    }
}
