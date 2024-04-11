/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Exceptions;

public class ClientService {

    public static void consultClient(String code) throws Client2NotFoundException {
        try {
            ClientDAO.consultClient(code);
        } catch (ClientNotFoundException e) {
            throw new Client2NotFoundException(e.getMessage(), e);
        }
    }
}
