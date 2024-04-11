/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.dao;

import br.com.alexandreG.domain.Client;

import java.util.Collection;

public interface IClientDAO {

    public boolean register(Client client);

    public void delete(Long cpf);
    public void change(Client client);
    public Client consult(Long cpf);
    public Collection<Client>searchALL();
}
