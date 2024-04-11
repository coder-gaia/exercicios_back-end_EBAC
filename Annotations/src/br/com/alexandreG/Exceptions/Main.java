/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.Exceptions;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        String input = JOptionPane.showInputDialog(
                null,
                "Insert the client's code: ",
                "Input Insertion", JOptionPane.INFORMATION_MESSAGE);


        try{
            ClientService.consultClient(input);
        }catch (Client2NotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                     e.getMessage(),
                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
