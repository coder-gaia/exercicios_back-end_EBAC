/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.agregacao;

public class Salesman {

    private String name;
    private Double commission;
    public void sells(){
        System.out.println("Sell!");
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
