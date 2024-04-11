/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.builder;

public class Manager {

    BurguerBuilder builder;

    public BurguerBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(BurguerBuilder builder) {
        this.builder = builder;
    }

    public Burguer buildBurger() {
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
