package model.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to hold list of Product objects
 * @author Morten Feldt
 */

public class Products {

    private Map<Integer, Product> products;

    public Products() {
        this.products = new HashMap();
    }

    public Products(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product p){
        products.put(p.getId(), p);
    }
    
}
