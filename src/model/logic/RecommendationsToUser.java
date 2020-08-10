package model.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import model.products.Product;
import model.products.ProductPurchased;
import model.products.Products;
import model.products.ProductsPurchased;
import model.users.User;
import model.users.Users;

/**
 * Class used for methods to find a list with Recommendations Products to a user
 * @author Morten Feldt
 */

public class RecommendationsToUser {
    public List<ProductPurchased> getTop3Recommendations(Product product, Products products){
        List<ProductPurchased> productPurchased = getListOfSameKeywords(product, products);
        Collections.sort(productPurchased);
        return productPurchased.stream().limit(3).collect(Collectors.toList());        
    }
    
    public List<ProductPurchased> getListOfSameKeywords(Product product, Products products){
        List<String> listOfKeywords = product.getGenre();
        List<ProductPurchased> productPurchased = new ArrayList();
        
        for (Product productList : products.getProducts().values()) {
            if(productList.getId() != product.getId()){
                int count = checkSameKeyword(listOfKeywords, productList);
                productPurchased.add(new ProductPurchased(
                        productList.getId(), 
                        productList.getName(), 
                        productList.getYear(), 
                        productList.getGenre(), 
                        productList.getRating(), 
                        productList.getPrice(), 
                        count));
            }
        }
        
        return productPurchased;
    }
    
    public int checkSameKeyword(List<String> keyword, Product product){
        int count = 0;
        for (int i = 0; i < keyword.size(); i++) {
            if(product.getGenre().contains(keyword.get(i))){
                count += 1;
            }
        }
        return count;
    }

}
