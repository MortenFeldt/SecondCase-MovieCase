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
        FileFacadeImpl fileFacadeImpl = new FileFacadeImpl();
        
        Products products = fileFacadeImpl.getProductDataFromFile("Products.txt");
        
        for (Product product : products.getProducts().values()) {
            System.out.println("*************************************");
            System.out.println(product.getName());
            System.out.println("*************************************");
        }
        
        Users users = fileFacadeImpl.getUserDataFromFile("Users.txt", products);
        
        for (User user : users.getUsers().values()) {
            System.out.println("*************************************");
            System.out.println(user.getViewed().size());
            System.out.println("*************************************");
        }
    }
    
}
