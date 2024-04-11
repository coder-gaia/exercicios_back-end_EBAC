/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.builder;

public class BurguerRestaurantDirector {

    private BurguerBuilder burguerBuilder;

    public void setBuilder(BurguerBuilder burguerBuilder){
        this.burguerBuilder = burguerBuilder;
    }

    public Burguer buildBurguer(){
        burguerBuilder.buildBun();
        burguerBuilder.buildSalad();
        burguerBuilder.buildCheese();
        burguerBuilder.buildSauce();
        burguerBuilder.buildMeat();
        return burguerBuilder.build();
    }
}
