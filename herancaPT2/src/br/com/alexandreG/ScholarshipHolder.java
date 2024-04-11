/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class ScholarshipHolder extends Student{
    private Float scholarship;
    public void renewScholarship(){}

    @Override
    public void payment(){
        System.out.println(this.getName() + " is a scholarship holder. Half payment!");
    };

    public Float getScholarship() {
        return scholarship;
    }

    public void setScholarship(Float scholarship) {
        this.scholarship = scholarship;
    }

}
