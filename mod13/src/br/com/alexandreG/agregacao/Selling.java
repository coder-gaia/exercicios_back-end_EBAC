/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Selling {

    public Selling(){
        this.products = new ArrayList<>();
    }

    public void finishSelling(){
        System.out.println("Buyer: " + this.buyer.getName());
        System.out.println("Items purchased: ");
        for (Product prod : this.products){
            System.out.println("Item name: " + prod.getName() + " - Price: " + prod.getPrice());
        }
        System.out.println("Salesman: " + this.salesman.getName());

    }

    public void cancelSelling(){
        System.out.println("Purchase cancelled.");
    }

    private Buyer buyer;
    private Salesman salesman;
    private List<Product> products;

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void add(Product product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Selling{" +
                "buyer=" + buyer.getName() +
                ", salesman=" + salesman.getName() +
                ", products=" + products +
                '}';
    }
}
