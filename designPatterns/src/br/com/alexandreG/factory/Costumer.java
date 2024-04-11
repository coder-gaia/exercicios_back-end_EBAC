/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.factory;

public class Costumer {

    private String gradeRequest;
    private boolean hasCompanyContract;

    public Costumer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest= gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }
    public String getGradeRequest() {
        return gradeRequest;
    }
}
