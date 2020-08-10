package view;

import java.util.List;
import java.util.Scanner;
import model.products.ProductPurchased;
import model.users.User;
import model.users.Users;

/**
 * Console class used for view
 * @author Morten Feldt
 */

public class Console {
    
    public String startupMenu(Users users){
        Scanner scan = new Scanner(System.in);
        System.out.println("****************Users from file****************");
        for (User user : users.getUsers().values()) {
            System.out.println("ID: " + user.getId() + " - " + "Name: " + user.getName());
        }
        System.out.print("Entering person id ex. 1 (Press 0 to end program): ");
        String input = scan.nextLine();
        return input;
    }
    
    public void showRecentPopularProducts(List<ProductPurchased> products){
        System.out.println("******Exercise 1: Recent Popular Products******");
        for (ProductPurchased productPurchased : products) {
            System.out.println("ID: " + productPurchased.getId() + " - " + "Name: " + productPurchased.getName() + " - " + "Year: " + productPurchased.getYear());
        }
    }
    
    public void showRecommendationsForUser(List<ProductPurchased> products){
        System.out.println("**********Exercise 2: Recommendations**********");
        for (ProductPurchased product : products) {
            System.out.println("ID: " + product.getId() + " - " + "Name: " + product.getName() + " - " + "Year: " + product.getYear());
        }
    }
    
    public void fileNotfoundErrorMessage(String message){
        System.err.println(message);
    }
    
    public void userNotfoundErrorMessage(){
        System.err.println("User id could not be found!");
    }

}
