package br.com.alexandreG;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args){

        //arrays - sizes never changes once created.
        //can hold primitive or objects.
        //u can get 'em by their indexes: [0][1][2][3]
        String[] friendsArray = {"John", "Mike", "Walter", "Lucy"};

        //arrayList - don't have fixed sizes.
        //can only hold objects.
        //But support wrapper types for primitives.
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Peter", "Jessie", "George", "Jake"));

        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        //getting the size w/ arrayList
        System.out.println(friendsArrayList.size());

        //getting the size w/ array
        System.out.println(friendsArray.length);

        friendsArrayList.add("Ginny");
        friendsArrayList.add("Patrice");
        System.out.println(friendsArrayList);

        //removing an element. We can either pass the element itself or its index.
        friendsArrayList.remove("Jessie");
        System.out.println(friendsArrayList);

        //setting an element, replacing its value. w/ array
        friendsArray[0] = "Marshall";
        //displaying the whole array
        System.out.println(Arrays.toString(friendsArray));

        //setting an element, replacing its value. w/ arrayList
        //it was like this
        System.out.println(friendsArrayList);
        friendsArrayList.set(3, "Chandler");
        //after changes
        System.out.println(friendsArrayList);

    }
}
