/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.abstratas;

public abstract class Employee {

    private String name;
    private  String surName;
    private String cpf;

    public abstract Double dueDate();

    public void showSur(){
        System.out.println("the surname is: " + this.surName);
    }

    public void showValues(){
        Double value = dueDate();

        System.out.println("employee payment: " + value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
