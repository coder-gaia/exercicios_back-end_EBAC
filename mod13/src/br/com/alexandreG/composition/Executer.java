/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.composition;

public class Executer {

    public static void main(String[] args){
        Bank bank = new Bank();
        bank.setName("JP Chase Morgan");
        bank.setCode(19l);

        CurrentAccount ca = new CurrentAccount();
        ca.setBank(bank);
        ca.setBalance(1000d);

        SavingsAccount sa = new SavingsAccount();
        sa.setBank(bank);
        sa.setBalance(5000d);
    }
}
