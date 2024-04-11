/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

public class Example1 {
    public static void main(String[] args){
   //boxing (autoboxing)
    Boolean status = true;
    Character letter = 'c';
    Integer age = 10;
    //this isn't a boxing
    Long cpf = Long.valueOf(13711020);
    //this is
    Long cpf_2 = 13711020L;

    //unboxing
     boolean status_2 = Boolean.TRUE;
     char letter_2 = Character.valueOf('A');
     int age_2 = Integer.valueOf(19);
     long cpf_3 = Long.valueOf(12345);
    }
}
