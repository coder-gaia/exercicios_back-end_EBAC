/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.dao;

import br.com.alexandreG.domain.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDao implements IClientDAO{

    private Map<Long, Client> map;

    public ClientMapDao(){
        this.map = new HashMap<>();
    }

    @Override
    public boolean register(Client client) {
        if(this.map.containsKey(client.getCpf())){
            return false;
        }
        this.map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public void delete(Long cpf) {
        Client registeredClient = this.map.get(cpf);

        if(registeredClient != null){
            this.map.remove(registeredClient.getCpf(), registeredClient);
        }

    }

    @Override
    public void change(Client client) {
        Client registeredClient = this.map.get(client.getCpf());

        if(registeredClient != null){
            registeredClient.setName(client.getName());
            registeredClient.setTelephone(client.getTelephone());
            registeredClient.setNumber(client.getNumber());
            registeredClient.setAddress(client.getAddress());
            registeredClient.setCity(client.getCity());
            registeredClient.setState(client.getState());
        }
    }

    @Override
    public Client consult(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> searchALL() {
        return this.map.values();
    }


}
