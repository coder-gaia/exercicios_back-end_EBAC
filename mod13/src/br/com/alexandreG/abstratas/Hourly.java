/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.abstratas;

public class Hourly extends Employee{

    private Double hourlyPrice;
    private Double workedHours;

    @Override
    public Double dueDate() {
        return hourlyPrice*workedHours;
    }

    public Double getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(Double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public Double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Double workedHours) {
        this.workedHours = workedHours;
    }
}
