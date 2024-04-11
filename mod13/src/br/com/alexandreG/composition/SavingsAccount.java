/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.composition;

public class SavingsAccount {

    private Bank bank;

    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
