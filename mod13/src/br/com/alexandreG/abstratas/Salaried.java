/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.abstratas;

public class Salaried extends Employee{

    private Double Salary;


    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public Double dueDate() {
        return Salary;
    }
}
