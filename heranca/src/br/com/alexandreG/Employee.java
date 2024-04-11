/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public class Employee extends Person {
    private String sector;
    private Boolean working = true;

    public void changeJob(Boolean working){
        this.working = ! this.working;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }
}
