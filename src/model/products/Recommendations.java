package model.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to holds products that is recommendation for a user
 * @author Morten Feldt
 */

public class Recommendations {

    private List<Product> products;

    public Recommendations() {
        this.products = new ArrayList();
    }

    public Recommendations(List<Product> products) {
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
