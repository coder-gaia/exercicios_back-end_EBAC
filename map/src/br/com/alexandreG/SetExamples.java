/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

import java.util.*;

public class SetExamples {

    //Set does not allow duplicates, but there are no ordering 'em

    public static void main(String[] args){

        Set<String> names = new HashSet<>();

        names.add("Alexandre");
        names.add("Hermione");
        names.add("Harry");
        names.add("Ginny");

       //names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }


        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        System.out.println(numbersList);

        Set<Integer> setNumbersList = new HashSet<>(numbersList);
        System.out.println(setNumbersList);
    }
}
