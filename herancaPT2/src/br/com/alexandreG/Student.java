/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Student extends Person{

    private Integer registration;
    private String course;

    public void payment(){
        System.out.println(this.getName() + " Your payment was confirmed.");
    };

    public void cancelRegistration(String name){
        System.out.println(name + " Your registration was cancelled.");
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
