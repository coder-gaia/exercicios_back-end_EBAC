/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.register.dao;
import br.com.alexandreG.register.dao.generic.GenericDAO;
import br.com.alexandreG.register.domain.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO extends GenericDAO<Client> implements IClientDAO{


    public ClientMapDAO() {
        super();
        Map<Long, Client> innerMap = this.map.get(getClassType());
        if (innerMap == null) {
            innerMap = new HashMap<>();
            this.map.put(getClassType(), innerMap);
        }
    }

    @Override
    public void updateData(Client entity, Client registeredEntity) {
        if(registeredEntity != null){
            registeredEntity.setName(entity.getName());
            registeredEntity.setTelephone(entity.getTelephone());
            registeredEntity.setNumber(entity.getNumber());
            registeredEntity.setAddress(entity.getAddress());
            registeredEntity.setCity(entity.getCity());
            registeredEntity.setState(entity.getState());
        }
    }

    @Override
    public Class<Client> getClassType() {
        return Client.class;
    }

/*
    private Map<Long, Client> map;

    public ClientMapDAO(){
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
    }*/


}
