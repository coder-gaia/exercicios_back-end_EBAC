/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Exceptions;

public class Client2NotFoundException extends Exception{

    private Exception e;

    Client2NotFoundException(String message, Throwable e){
        super(message, e);
    }
}
