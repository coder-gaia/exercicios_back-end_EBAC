/**
 * @Author alexandre.gaia
 *
 * @version  1.0.0
 */

public class Client {
    private int code;
    private String name;
    private String address;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //GET serve para pescar/retornar um valor.
    public String getAddress() {
        return address;
    }

    //SET serve para adcionar/setar um valor.
    public void setAddress(String address) {
        this.address = address;
    }

    public void registerAddress(String address){
        setAddress(address);
    }

    public void printAddress(){
        System.out.println(this.address);
    }

    public String returnClientName(){
        return "Alexandre's address";
    }

    /**
     *
     * Method that calculates the total value.
     *
     * @return return the total value.
     *
     * @deprecated
     * @see int getTotalValue(int count)
     */

    public int getTotalValue(){
        return 20;
    }


}
