package controller;

import java.io.FileNotFoundException;
import model.File.FileFacadeImpl;
import model.interfaces.FileFacade;
import model.logic.RecentPopularProducts;
import model.logic.RecommendationsToUser;
import model.products.Product;
import model.products.ProductPurchased;
import model.products.Products;
import model.products.Recommendations;
import model.users.User;
import model.users.Users;
import view.Console;

/**
 *
 * @author Morten Feldt
 */
public class Controller {

    public static void main(String[] args) throws FileNotFoundException {
        final String FILE_PRODUCT = "Products.txt";
        final String FILE_USERS = "Users.txt";
        
        Console console = new Console();
        FileFacadeImpl fileFacadeImpl = new FileFacadeImpl();
        RecentPopularProducts recentPopularProducts = new RecentPopularProducts();
        RecommendationsToUser recommendationsToUser = new RecommendationsToUser();
        
        Products products = fileFacadeImpl.getProductDataFromFile(FILE_PRODUCT);      
        Users users = fileFacadeImpl.getUserDataFromFile(FILE_USERS, products);
        
        String input = "";
        
        console.showRecentPopularProducts(recentPopularProducts.getTop3MostPurchased(users));
        
        while(!input.equals("0")){
            
            input = console.startupMenu(users);
            
            if(input.equals("0")){
                System.exit(0);
            } else {
                //User input to detect user id and other methods to recommendations
                //console.showRecommendationsForUser(products);
            }
        }
    }
    
}
