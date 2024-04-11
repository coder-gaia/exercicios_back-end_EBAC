/**
 * @author alexandre.gaia
 */
package br.com.alexandreG.register.dao.generic;

import br.com.alexandreG.register.domain.Client;
import br.com.alexandreG.register.domain.IPersistance;

import java.util.Collection;

public interface IGenericDAO <T extends IPersistance> {

    public boolean register(T entity);
    public void delete(Long value);
    public void change(T entity);
    public T consult(Long value);
    public Collection<T> searchALL();
}
