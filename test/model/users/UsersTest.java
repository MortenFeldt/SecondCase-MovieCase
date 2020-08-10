package model.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.products.Product;
import model.products.Products;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about User class object
 * @author Morten Feldt
 */
public class UsersTest {
    private int userId = 0;
    private String userName = "";
    private ArrayList<Product> userProductViewed = new ArrayList();
    private ArrayList<Product> userProductPurchased = new ArrayList();
    private int productId = 0;
    private String productName = "";
    private int productYear = 0;
    private double productRating = 0.0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private Product productTest;
    private Map<Integer, User> users = new HashMap();
    
    @Before
    public void init(){
        userId = 456;
        userName = "Morten Feldt";
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
        User user = new User(userId, userName, userProductViewed, userProductPurchased);
        users.put(user.getId(), user);
    }
    
    @Test
    public void testGetProducts(){
        Users usersTest = new Users(users);
        int expected = 1;
        int actual = usersTest.getUsers().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetProducts(){
        Users usersTest = new Users(users);
        usersTest.setUsers(users);
        int expected = 1;
        int actual = usersTest.getUsers().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToProductsList(){
        Users usersTest = new Users(users);
        int newId = 789;
        User userNewTest = new User(newId, userName, userProductViewed, userProductPurchased);
        usersTest.addUser(userNewTest);
        int expected = 2;
        int actual = usersTest.getUsers().size();
        assertEquals(expected, actual);
    }
    
}
