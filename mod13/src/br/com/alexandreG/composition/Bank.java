/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.composition;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    private Set<CurrentAccount> currentAccounts;

    private Set<SavingsAccount> savingsAccounts;

    public Bank(){
        this.currentAccounts = new HashSet<>();
        this.savingsAccounts = new HashSet<>();
    }

    public void add(CurrentAccount ca){
        this.currentAccounts.add(ca);
    }

    public void add(SavingsAccount sa){
        this.savingsAccounts.add(sa);
    }

    private Long code;

    private String name;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
