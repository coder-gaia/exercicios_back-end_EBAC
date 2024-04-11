/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Professor extends Person{

    private String specialty;
    private Float salary;

    public void getARaise(Float raise){
        this.salary += raise;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
