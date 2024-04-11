/**
 * @Author alexandre.gaia
 */

public class FirstClass {
    public static void main (String[] args){

        System.out.println("Hello, Alexandre");
        Client client = new Client();
        client.registerAddress("Abbot Street");
        client.setCode(1);

        System.out.println(client.getCode());
        //client.printAddress()
        System.out.println(client.returnClientName());
        //System.out.println(client.getTotalValue());
    }
}
