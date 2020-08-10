package controller;

import java.io.FileNotFoundException;
import model.File.FileFacadeImpl;
import model.logic.RecentPopularProducts;
import model.logic.RecommendationsToUser;
import model.products.Product;
import model.products.Products;
import model.users.UserSessions;
import model.users.Users;
import view.Console;

/**
 *
 * @author Morten Feldt
 */
public class Controller {

    public static void main(String[] args) {
        final String FILE_PRODUCT = "Products.txt";
        final String FILE_USERS = "Users.txt";
        final String FILE_USER_SESSION = "CurrentUserSession.txt";
        
        Console console = new Console();
        FileFacadeImpl fileFacadeImpl = new FileFacadeImpl();
        RecentPopularProducts recentPopularProducts = new RecentPopularProducts();
        RecommendationsToUser recommendationsToUser = new RecommendationsToUser();
        
        Products products = null;
        Users users = null;
        UserSessions userSessions = null;
        
        try{
            products = fileFacadeImpl.getProductDataFromFile(FILE_PRODUCT);      
            users = fileFacadeImpl.getUserDataFromFile(FILE_USERS, products);
            userSessions = fileFacadeImpl.getUserSessionDataFromFile(FILE_USER_SESSION, users, products);
        } catch (FileNotFoundException ex){
            console.fileNotfoundErrorMessage(ex.getMessage());
            System.exit(0);
        }
        
        
        String input = "";
        
        console.showRecentPopularProducts(recentPopularProducts.getTop3MostPurchased(users));
        
        while(!input.equals("0")){
            
            input = console.startupMenu(users);
            
            if(input.equals("0")){
                System.exit(0);
            } else {
                if(userSessions.getUserSessions().containsKey(Integer.parseInt(input))){
                    Product product = userSessions.getUserSessions().get(Integer.parseInt(input));
                    console.showRecommendationsForUser(recommendationsToUser.getTop3Recommendations(product, products));
                } else {
                    console.userNotfoundErrorMessage();
                }
            }
        }
    }
    
}
