package model.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold list of Product objects
 * @author Morten Feldt
 */

public class Products {

    private List<Product> products;

    public Products() {
        this.products = new ArrayList();
    }

    public Products(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product p){
        products.add(p);
    }
    
}
