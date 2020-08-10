package model.interfaces;

import model.products.Product;
import model.products.Products;

/**
 *
 * @author Morten
 */
public interface ProductMapper {
    public Products getProductsFromContent(String content);   
    public Product getProductFromContentLine(String contentLine);
}
