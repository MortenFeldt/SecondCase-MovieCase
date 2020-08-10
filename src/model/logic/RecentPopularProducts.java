package model.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import model.products.Product;
import model.products.ProductPurchased;
import model.products.ProductsPurchased;
import model.users.User;
import model.users.Users;

/**
 * Class used for methods to find a list with Recent Popular Products
 * @author Morten Feldt
 */

public class RecentPopularProducts {
    public List<ProductPurchased> getTop3MostPurchased(Users users){
        List<ProductPurchased> productPurchased = makeListOfProductPurchased(users).getProductsPurchaed();
        Collections.sort(productPurchased);
        return productPurchased.stream().limit(3).collect(Collectors.toList());        
    }
    
    public ProductsPurchased makeListOfProductPurchased(Users users){
        ArrayList<Product> productsCollection = concatListProdutctsViewed(users);
        ProductsPurchased productsPurchased = new ProductsPurchased();
        
        for (Product product : productsCollection) {
            int count = Collections.frequency(productsCollection, new Product(product.getId(), product.getName(), product.getYear(), product.getRating(), product.getPrice()));
            ProductPurchased productPurchased = new ProductPurchased(product.getId(), product.getName(), product.getYear(), product.getGenre(), product.getRating(), product.getPrice(), count);
            if(!(productsPurchased.getProductsPurchaed().contains(productPurchased))){
                productsPurchased.addProductPurchaed(productPurchased);
            }
        }
        return productsPurchased;
    }
    
    public ArrayList<Product> concatListProdutctsViewed(Users users){
        ArrayList<Product> products = new ArrayList();
        
        for (User user : users.getUsers().values()) {
            products.addAll(user.getViewed());
        }
        
        return products;
    }
}
