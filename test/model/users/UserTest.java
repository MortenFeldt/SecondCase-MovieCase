package model.users;

import java.util.ArrayList;
import model.products.Product;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about User class object
 * @author Morten Feldt
 */
public class UserTest {
    
    private ArrayList<Product> userProductViewed = new ArrayList();
    private ArrayList<Product> userProductPurchased = new ArrayList();
    private String productName = "";
    private int productRating = 0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private Product productTest;
    
    @Before
    public void init(){
        productName = "Test Product 1";
        productRating = 1;
        productPrice = 134.95;
        productGenre.add("Action");
        productGenre.add("Thrillre");
        productGenre.add("Comedy");
        productTest = new Product(productName, productGenre, productRating, productPrice);
        userProductViewed.add(productTest);
        userProductPurchased.add(productTest);       
    }
    
    @Test
    public void testUserGetName(){
        String userName = "Morten Feldt";
        User userTest = new User(userName);
        String expected = "Morten Feldt";
        String actual = userTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetName(){
        String userName = "Morten Feldt";
        User userTest = new User(userName);
        String newUserName = "Morten Feldt Test";
        userTest.setName(newUserName);
        String expected = "Morten Feldt Test";
        String actual = userTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserGetViewed(){
        String userName = "Morten Feldt";
        User userTest = new User(userName, userProductViewed, null);
        int expected = 1;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetViewed(){
        String userName = "Morten Feldt";
        User userTest = new User(userName);
        userTest.setViewed(userProductViewed);
        int expected = 1;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserGetPurchased(){
        String userName = "Morten Feldt";
        User userTest = new User(userName, null, userProductPurchased);
        int expected = 1;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetPurchased(){
        String userName = "Morten Feldt";
        User userTest = new User(userName);
        userTest.setPurchased(userProductPurchased);
        int expected = 1;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddViewed(){
        String userName = "Morten Feldt";
        User userTest = new User(userName, userProductViewed, null);
        userTest.addViewed(productTest);
        int expected = 2;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddPurchased(){
        String userName = "Morten Feldt";
        User userTest = new User(userName, null, userProductPurchased);
        userTest.addPurchased(productTest);
        int expected = 2;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
}
