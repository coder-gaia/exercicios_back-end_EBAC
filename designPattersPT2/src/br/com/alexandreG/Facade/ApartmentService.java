/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Facade;

public class ApartmentService implements IApartmentService{

    @Override
    public Boolean registerApartment(Apartment apartment) {
        Boolean isRegistered = isAptRegistered(apartment);

        Boolean areFieldsValids = areFieldsValids(apartment);

        if(isRegistered && !areFieldsValids){
            return false;
        }

        return  registerApt(apartment);
    }

    private Boolean registerApt(Apartment apartment) {
        return true;
    }

    private Boolean isAptRegistered(Apartment apartment){
        return false;
    }

    private Boolean areFieldsValids(Apartment apartment){
        return  true;
    }
}
