package model.interfaces;

import model.products.Product;
import model.products.Products;
import model.users.User;

/**
 *
 * @author Morten
 */
public interface ProductMapper {
    public Products getProductsFromContent(String content);   
    public Product getProductFromContentLine(String contentLine);
}
