/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.agregacao;

public class Product {

    private String name;

    private Long code;

    private Double price;
    public void sold(){
        System.out.println("Sold!");
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
