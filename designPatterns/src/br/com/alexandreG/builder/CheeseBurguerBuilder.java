/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.builder;

public class CheeseBurguerBuilder extends BurguerBuilder {

    @Override
    public void buildBun() {
        burguer.setBun("White Bread");
    }
    @Override
    public void buildMeat() {
        burguer.setMeat("Beef");
    }
    @Override
    public void buildSalad() {
        burguer.setSalad("Iceberg");
    }
    @Override
    public void buildCheese() {
        burguer.setCheese("American Cheese");
    }
    @Override
    public void buildSauce() {
        burguer.setSauce("Secret Sauce");
    }
}
