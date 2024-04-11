/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

public class Operators {
    public static void main(String[] args){
        ArithmeticsOperations();
        AssignmentOperations();
        IncrementAndDecrementOperations();
        RelationalOperations();
        LogicalOperations();
    }


    public static void ArithmeticsOperations(){
        System.out.println("------------Arithmetics Operations------------");

        int num1 = 60;
        int num2 = 20;
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 * num2;
        int num6 = num1 / num2;

        System.out.println("The result is: " + num3);
        System.out.println("The result is: " + num4);
        System.out.println("The result is: " + num5);
        System.out.println("The result is: " + num6);
    }

    public static void AssignmentOperations (){
        System.out.println("------------Assignment Operations------------");

        int number1 = 10;
        int number2 = 10;
        int number3 = number1 + number2;
        number3 += number3;

        System.out.println(number3);
    }

    public static void IncrementAndDecrementOperations() {
        System.out.println("------------Increment and Decrement Operations------------");

        int num1 = 10;
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
    }

    public static void RelationalOperations(){
        System.out.println("------------Relational Operations------------");

        int number1 = 11;
        int number2 = 30;

        boolean isGreaterThan = number1 < number2;
        System.out.println("number 1 is greater than number 2: " + isGreaterThan);

        boolean isDiff = number1 != number2;
        System.out.println("number 1 is different than number 2: " + isDiff);

    }

    public static void LogicalOperations(){
        System.out.println("------------Logical Operations------------");

        int number1 = 11;
        int number2 = 30;

        //both right and left MUST be true: true && true (AND)
        boolean inRangeOf10 = number1 > 0 && number1 <= 10;
        System.out.println("number 1 is in the range of 10: " + inRangeOf10);

        //AT LEAST one side must be true: true || false (OR)
        boolean inRangeOf20 = number1 > 0 || number1 <= 20;
        System.out.println("number 1 is in the range of 20: " + inRangeOf20);

        //setting the " ! " inverts the variable result. if is true becomes false, and so on
        boolean inRangeOf30 = number2 > 0;
        System.out.println("number 2 is greater than 30: " + !inRangeOf30);
    }
}
