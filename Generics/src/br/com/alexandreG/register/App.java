/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.register;
import br.com.alexandreG.register.dao.ClientMapDAO;
import br.com.alexandreG.register.dao.IClientDAO;
import br.com.alexandreG.register.domain.Client;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;

    public static void main(String[] args){

        iClientDAO = new ClientMapDAO();

        String option = JOptionPane.showInputDialog(
                null,
                "Insert 1 to register, 2 to consultation, 3 to exclusion, 4 to change or 5 to exit: ",
                "Client Area", JOptionPane.INFORMATION_MESSAGE);

        while(!isOptionValid(option)){
            if("".equals(option)){
                quit();
            }
            option = JOptionPane.showInputDialog(null, "Invalid Option! Insert 1 to register, 2 to consultation, 3 to exclusion, 4 to change or 5 to exit: ",
                    "Register", JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOptionValid(option)){
            if(isOptionQuit(option)){
                quit();
            } else if (isOptionRegistration(option)) {
                String data = JOptionPane.showInputDialog(
                        null,
                        "Insert the client's data separated by comma, E.G: Name, Cpf, Telephone, Address, Number, City, State",
                        "Registration", JOptionPane.INFORMATION_MESSAGE
                );
                register(data);

                option = JOptionPane.showInputDialog(
                        null,
                        "Insert 1 to register, 2 to consultation, 3 to exclusion, 4 to change or 5 to exit: ",
                        "Client Area", JOptionPane.INFORMATION_MESSAGE);

            } else if (isOptionConsultation(option)) {
                String data = JOptionPane.showInputDialog(
                        null,
                        "Insert the client's cpf: ",
                        "Consultation", JOptionPane.INFORMATION_MESSAGE
                );
                consult(data);

                option = JOptionPane.showInputDialog(
                        null,
                        "Insert 1 to register, 2 to consultation, 3 to exclusion, 4 to change or 5 to exit: ",
                        "Client Area", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


    private static void register(String data){
        String[] organizedData = data.split(",");
        if(organizedData.length < 7){
            JOptionPane.showMessageDialog(null,
                    "Incomplete client information. Please provide all required fields.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String name = organizedData[0].trim();
        String cpf = organizedData[1].trim();
        String telephone = organizedData[2].trim();
        String address = organizedData[3].trim();
        String number = organizedData[4].trim();
        String city = organizedData[5].trim();
        String state = organizedData[6].trim();

        if (name.isEmpty() || cpf.isEmpty() || telephone.isEmpty() || address.isEmpty() || number.isEmpty() || city.isEmpty() || state.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide all required fields.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Client client = new Client(name, cpf, telephone, address, number, city, state);

        boolean isRegistered = iClientDAO.register(client);
        if(isRegistered){
            JOptionPane.showMessageDialog(
                    null,
                    "Client registered successfully!",
                    "Success", JOptionPane.INFORMATION_MESSAGE
            );
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "This client is already registered.",
                    "ERROR", JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    private static void consult(String data){
        Client client = iClientDAO.consult(Long.parseLong(data));
        if(client != null){
            JOptionPane.showMessageDialog(null,
                    "Client found: " + client,
                    "Success", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Unable to find the specified client.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static boolean isOptionQuit(String option) {
        return "5".equals(option);
    }

    private static boolean isOptionConsultation(String option) {
        return "2".equals(option);
    }

    private static boolean isOptionRegistration(String option) {
        return "1".equals(option);
    }

    private static void quit(){
        JOptionPane.showMessageDialog(null, "Good Bye.", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOptionValid(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option) || "5".equals(option);
    }
}
