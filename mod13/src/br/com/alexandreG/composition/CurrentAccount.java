/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.composition;

public class CurrentAccount {

    private Bank bank;

    private Double balance;

    private Double specialCheck;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(Double specialCheck) {
        this.specialCheck = specialCheck;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
