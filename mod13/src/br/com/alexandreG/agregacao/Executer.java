/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.agregacao;

public class Executer {

    public static void main(String[] args){

        Product product_tv = createProduct(1l, 3000d, "TV");
        Product product_smart = createProduct(2l, 2000d, "Smartphone");

        Salesman salesman = createSalesman("Phill", 10d);
        
        Buyer buyer = createBuyer("Joseph", 2000d);

        Selling selling = new Selling();
        selling.setSalesman(salesman);
        selling.setBuyer(buyer);
        selling.add(product_smart);
        selling.add(product_tv);

        selling.finishSelling();
        System.out.println(selling);
    }

    private static Buyer createBuyer(String name, Double budget) {
        return new Buyer(name, budget);

    }

    private static Salesman createSalesman(String name, Double commission) {
        Salesman salesman = new Salesman();
        salesman.setName(name);
        salesman.setCommission(commission);
        return salesman;
    }

    private static Product createProduct(Long code, Double value, String name) {
        Product product = new Product();
        product.setCode(code);
        product.setPrice(value);
        product.setName(name);
        return product;
    }
}
