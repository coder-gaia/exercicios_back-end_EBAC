/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.generics;

public class GenericEntryExample2 {
    public static void main(String[] args) {
        GenericEntry<String, Integer> entry = new GenericEntry<>("Something", 10);
        System.out.println("Data: " + entry.getData());
        System.out.println("Rank: " + entry.getRank());


        GenericEntry<Float, Integer> entry2 = new GenericEntry<>(1.2f, 10);
        System.out.println("Data: " + entry2.getData());
        System.out.println("Rank: " + entry2.getRank());
    }
}
