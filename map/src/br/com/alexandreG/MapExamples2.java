/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

import java.util.HashMap;

public class MapExamples2 {

    public static void main(String[] args){

        //if the LinkedHashMap were to be used, the elements would've been aligned alphabetically.
        HashMap<String, Integer> employeeIds = new HashMap<>();

        employeeIds.put("Alexandre", 12345);
        employeeIds.put("James", 54321);s
        employeeIds.put("Claire", 78910);

        System.out.println(employeeIds);

        System.out.println("Getting by the key:");
        System.out.println("Claire's id is: " + employeeIds.get("Claire"));

        System.out.println("Checks if the specified key exists in the collection: ");
        System.out.println(employeeIds.containsKey("Marshall"));
        System.out.println("Can also check if a specified value exists: ");
        System.out.println(employeeIds.containsValue(12345));

        //if u enter a new 'put' with the same key but a different value, it'll overwrite the current value and update it
        employeeIds.put("Alexandre", 98911);
        System.out.println(employeeIds);

        //inserts a new key/value if it doesn't exist already:
        employeeIds.putIfAbsent("Jenny", 2832);
        System.out.println(employeeIds);

        employeeIds.remove("Jenny");
        System.out.println(employeeIds);
    }
}
