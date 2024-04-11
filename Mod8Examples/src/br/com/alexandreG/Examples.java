/**
 * @Author alexandre.gaia
 */
package br.com.alexandreG;

public class Examples {

    public Examples(int value){
        this.value = value;
    }


    //variables types:
    private int value;
    private long biggerValue ;

    private float decimalValue;
    private double decimalValue2;

    private String text;
    private boolean status;

    private short shortNumber;
    private byte evenShorterNumber;

    public String returnText(){
        this.value = 12;
        this.text = null;
        String text = "something";
        return "hello";
    }

    public int returnIntNumber(){
        int val = 100;
        //this is redundant
        return val;
    }

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;

        System.out.println("The result is: " + num3);
    }
}
