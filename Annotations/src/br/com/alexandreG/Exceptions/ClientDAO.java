/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Exceptions;

public class ClientDAO {

    public static void consultClient(String code) throws ClientNotFoundException{
        //searching database
        boolean isRegistered = false;
        if(!isRegistered){
            throw new ClientNotFoundException("Client not found.");
        }
    }
}
