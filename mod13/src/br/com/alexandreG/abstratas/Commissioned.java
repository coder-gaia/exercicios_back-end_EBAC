/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.abstratas;

public class Commissioned extends Employee{

    private Double commissionFee;
    private Double totalSale;

    public Double getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(Double commissionFee) {
        this.commissionFee = commissionFee;
    }

    public Double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(Double totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public Double dueDate() {
        return totalSale*commissionFee;
    }
}
