/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public class Executer {

    public static void main(String[] args) {
        Costumer client = new Costumer("A", false);
        Factory factory = getFactory(client);
        Vehicle brasilia = factory.create(client.getGradeRequest());
        brasilia.startEngine();
    }

    private static Factory getFactory(Costumer client) {
        if (client.hasCompanyContract()) {
            return new FactoryContracts();
        } else {
            return new ContractlessFactory();
        }
    }
}
