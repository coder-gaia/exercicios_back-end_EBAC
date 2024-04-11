/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.register.dao.generic;


import br.com.alexandreG.register.domain.IPersistance;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends IPersistance> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public abstract void updateData(T entity, T registeredEntity);

    public GenericDAO() {
        if(this.map == null) {
            this.map = new HashMap<>();

        }
    }

    @Override
    public boolean register(T entity) {
       Map<Long, T> innerMap = this.map.get(getClassType());
        if(innerMap.containsKey(entity.getCode())){
            return false;
        }
        innerMap.put(entity.getCode(), entity);
        return true;
    }

    @Override
    public void delete(Long value) {
        Map<Long, T> innerMap = this.map.get(getClassType());
        T registeredObject = innerMap.get(value);

        if(registeredObject != null){
            this.map.remove(value, registeredObject);
        }
    }

    @Override
    public void change(T entity) {
        Map<Long, T> innerMap = this.map.get(getClassType());
        T registeredObject = innerMap.get(entity.getCode());

        if(registeredObject != null){
            updateData(entity, registeredObject);
        }
    }

    @Override
    public T consult(Long value) {
        Map<Long, T> innerMap = this.map.get(getClassType());
        return innerMap.get(value);
    }

    @Override
    public Collection<T> searchALL() {
        Map<Long, T> innerMap = this.map.get(getClassType());
        return innerMap.values();
    }
}
