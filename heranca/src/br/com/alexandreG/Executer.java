/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Executer {

    public static void main(String[] args){
        Person person = new Person();
        Employee employee = new Employee();
        Professor professor = new Professor();
        Student student = new Student();

        person.setName("Dean");
        person.setAge(40);
        person.setGender("Male");

        employee.setName("Lucille");
        employee.setAge(30);
        employee.setGender("Female");

        professor.setName("Lupin");
        professor.setAge(50);
        professor.setGender("Male");

        student.setName("Alexandre");
        student.setAge(20);
        student.setGender("Male");

        student.setCourse("Software Engineering");
        employee.setSector("Accounting");
        professor.setSpecialty("Defense Against the Dark Arts");
        professor.setSalary(5000f);

        System.out.println(person);
        System.out.println(employee);
        System.out.println(professor);
        System.out.println(student);

        System.out.println(student.getName() + "'s " +  "course is: " + student.getCourse());
        System.out.println(employee.getName() + " works at: " + employee.getSector());
        System.out.println("Professor " + professor.getName() + "'s " + "specialty is: " + professor.getSpecialty() + " and he makes $" + professor.getSalary() + " a month");



    }
}
