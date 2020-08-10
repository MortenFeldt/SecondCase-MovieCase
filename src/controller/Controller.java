package controller;

import java.io.FileNotFoundException;
import model.File.FileFacadeImpl;
import model.interfaces.FileFacade;
import model.products.Product;
import model.products.Products;
import model.users.User;
import model.users.Users;

/**
 *
 * @author Morten Feldt
 */
public class Controller {

    public static void main(String[] args) throws FileNotFoundException {
        final String FILE_PRODUCT = "Products.txt";
        final String FILE_USERS = "Users.txt";
        
        FileFacadeImpl fileFacadeImpl = new FileFacadeImpl();
        
        Products products = fileFacadeImpl.getProductDataFromFile(FILE_PRODUCT);
        
        for (Product product : products.getProducts().values()) {
            System.out.println("*************************************");
            System.out.println(product.getName());
            System.out.println("*************************************");
        }
        
        Users users = fileFacadeImpl.getUserDataFromFile(FILE_USERS, products);
        
        for (User user : users.getUsers().values()) {
            System.out.println("*************************************");
            System.out.println(user.getViewed().size());
            System.out.println("*************************************");
        }
    }
    
}
