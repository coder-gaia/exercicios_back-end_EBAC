/**
 * @author alexandre.gaia
 */

package br.com.alexandreG.register.dao;


import br.com.alexandreG.register.dao.generic.GenericDAO;
import br.com.alexandreG.register.domain.Product;

import java.util.HashMap;

import java.util.Map;

public class ProductDAO extends GenericDAO<Product> implements IProductDAO {

    public ProductDAO() {
        super();
        Map<Long, Product> innerMap = this.map.get(getClassType());
        if (innerMap == null) {
            innerMap = new HashMap<>();
            this.map.put(getClassType(), innerMap);
        }
    }


    @Override
    public Class<Product> getClassType() {
        return Product.class;
    }

    @Override
    public void updateData(Product entity, Product registeredEntity) {

    }
}
