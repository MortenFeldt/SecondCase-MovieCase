package model.mapper;

import java.util.ArrayList;
import model.interfaces.ProductMapper;
import model.products.Product;
import model.products.Products;

/**
 * Mapper to use for data conversion from files to User objects
 * @author Morten Feldt
 */

public class ProductMapperImpl implements ProductMapper{
    
    @Override
    public Products getProductsFromContent(String content){
        Products products = new Products();
        String[] arrContent = content.split("\\n");
        for (int i = 0; i < arrContent.length; i++) {
            products.addProduct(getProductFromContentLine(arrContent[i]));
        }
        return products;
    }

    @Override
    public Product getProductFromContentLine(String contentLine) {
        String[] arrContentLine = contentLine.split(",");
        ArrayList<String> genre = new ArrayList();
        for (int j = 3; j < 8; j++) {
            if(!arrContentLine[j].trim().equals("")){
                genre.add(arrContentLine[j]);
            }
        }
        return new Product(
                Integer.parseInt(arrContentLine[0]), 
                arrContentLine[1], 
                Integer.parseInt(arrContentLine[2]), 
                genre, 
                Double.parseDouble(arrContentLine[8]), 
                Double.parseDouble(arrContentLine[9])
        );
    }

}
