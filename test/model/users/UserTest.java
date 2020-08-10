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
    private int productId = 0;
    private String productName = "";
    private int productYear = 0;
    private double productRating = 0.0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private Product productTest;
    
    @Before
    public void init(){
        productId = 123;
        productName = "Test Product 1";
        productYear = 2010;
        productRating = 1.1;
        productPrice = 134.95;
        productGenre.add("Action");
        productGenre.add("Thrillre");
        productGenre.add("Comedy");
        productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        userProductViewed.add(productTest);
        userProductPurchased.add(productTest);       
    }
    
    @Test
    public void testUserGetId(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        int expected = 456;
        int actual = userTest.getId();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetId(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        int newId = 789;
        userTest.setId(newId);
        int expected = 789;
        int actual = userTest.getId();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserGetName(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        String expected = "Morten Feldt";
        String actual = userTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetName(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        String newUserName = "Morten Feldt Test";
        userTest.setName(newUserName);
        String expected = "Morten Feldt Test";
        String actual = userTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserGetViewed(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName, userProductViewed, null);
        int expected = 1;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetViewed(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        userTest.setViewed(userProductViewed);
        int expected = 1;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserGetPurchased(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName, null, userProductPurchased);
        int expected = 1;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUserSetPurchased(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName);
        userTest.setPurchased(userProductPurchased);
        int expected = 1;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddViewed(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName, userProductViewed, null);
        userTest.addViewed(productTest);
        int expected = 2;
        int actual = userTest.getViewed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddPurchased(){
        int id = 456;
        String userName = "Morten Feldt";
        User userTest = new User(id, userName, null, userProductPurchased);
        userTest.addPurchased(productTest);
        int expected = 2;
        int actual = userTest.getPurchased().size();
        assertEquals(expected, actual);
    }
    
}
