/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Facade;

public class Apartment {

    public Apartment(String address, Long code){
        this.code = code;
        this.address = address;
    }

    private Long code;
    private String address;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "code=" + code +
                ", address='" + address + '\'' +
                '}';
    }
}
