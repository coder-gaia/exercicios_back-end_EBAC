/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Kangaroo extends Mammal{

    public void useBag(){
        System.out.println("Getting in the bag.");
    }

    @Override
    public void move() {
        System.out.println("Jumping");
    }
}
