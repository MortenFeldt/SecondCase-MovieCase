package model.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold ProductPurchaed objects
 * @author Morten Feldt
 */

public class ProductsPurchaed {

    private List<ProductPurchased> productsPurchaed;

    public ProductsPurchaed() {
        this.productsPurchaed = new ArrayList();
    }
    
    public ProductsPurchaed(List<ProductPurchased> productsPurchaed) {
        this.productsPurchaed = productsPurchaed;
    }

    public List<ProductPurchased> getProductsPurchaed() {
        return productsPurchaed;
    }

    public void setProductsPurchaed(List<ProductPurchased> productsPurchaed) {
        this.productsPurchaed = productsPurchaed;
    }
    
    public void addProductPurchaed(ProductPurchased p){
        productsPurchaed.add(p);
    }
    
}
