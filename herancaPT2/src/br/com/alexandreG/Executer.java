/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Executer {

    public static void main(String[] args){
        Student student = new Student();
        ScholarshipHolder scholarshipHolder = new ScholarshipHolder();

        student.setName("Alexandre");
        student.setRegistration(1293);
        student.setAge(20);
        student.setGender("Male");

        scholarshipHolder.setName("Hermione");
        scholarshipHolder.setAge(20);
        scholarshipHolder.setGender("Female");
        scholarshipHolder.setScholarship(50.5f);
        scholarshipHolder.setRegistration(2980);



        System.out.println(scholarshipHolder);
        student.payment();
        scholarshipHolder.payment();
        System.out.println(scholarshipHolder.getName() + " scholarship is:" + scholarshipHolder.getScholarship());

    }
}
