/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.abstratas;

public class Executer {

    public static void main(String[] args){

        Salaried salariedEmployee = new Salaried();
        salariedEmployee.setCpf("123");
        salariedEmployee.setName("Luke");
        salariedEmployee.setSurName("Skywalker");
        salariedEmployee.setSalary(3000d);
        printEmployeeInfos(salariedEmployee);

        Commissioned commissionedEmployee = new Commissioned();
        commissionedEmployee.setCpf("456");
        commissionedEmployee.setName("Dean");
        commissionedEmployee.setSurName("Winchester");
        commissionedEmployee.setTotalSale(2000d);
        commissionedEmployee.setCommissionFee(0.1d);
        printEmployeeInfos(commissionedEmployee);

        Hourly hourlyEmployee = new Hourly();
        hourlyEmployee.setCpf("789");
        hourlyEmployee.setName("Harry");
        hourlyEmployee.setSurName("Potter");
        hourlyEmployee.setHourlyPrice(100d);
        hourlyEmployee.setWorkedHours(60d);
        printEmployeeInfos(hourlyEmployee);
    }

    public static void printEmployeeInfos(Employee employee){
        if(employee instanceof Hourly){
            Hourly hour = (Hourly) employee;
            System.out.println(employee.getName() + " price p/hour is: " + hour.getHourlyPrice());
        }
        employee.showSur();
        employee.showValues();
        System.out.println(employee.getName() + " has made: " + employee.dueDate());
    }
}
