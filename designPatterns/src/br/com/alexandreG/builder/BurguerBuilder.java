/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.builder;

public abstract  class BurguerBuilder {

    Burguer burguer = new Burguer();

    Burguer build(){
        return burguer;
    }

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildSauce();


}
