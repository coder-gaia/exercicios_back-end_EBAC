/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

public class Example2 {
    public static void main(String[] args){

        //explicit casting
        int number_1 = 10;
        short number_2 = (short) number_1;

        long numL = 1111111111111111111L;
        System.out.println(numL);
        int numI = (int) numL;
        System.out.println(numI);

        //implicit casting
        int age = 19;
        long ageL = age;

        byte age_1 = 19;
        short ageS = age_1;

        double test = 9191;
        long test_1 = (long) test;
    }

}
