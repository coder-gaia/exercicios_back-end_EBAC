/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.builder;

public class Executer {

    public static void main(String[] args) {
        //Manager manager = new Manager(new CheeseBurgerBuilder());
        Manager manager = new Manager();
        manager.setBuilder(new CheeseBurguerBuilder());
        Burguer burger = manager.buildBurger();
        burger.print();

        //Manager manager_1 = new Manager(new VeganBurgerBuilder());
        manager.setBuilder(new VeganBurguerBuilder());
        Burguer burger_1 = manager.buildBurger();
        burger_1.print();
    }
}
