package model.products;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about ProductPurchased class object
 * @author Morten Feldt
 */
public class ProductPurchasedTest {
    
    private String productName = "";
    private int productRating = 0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private int productPurchased;
    
    @Before
    public void init(){
        productName = "Test Product 1";
        productRating = 1;
        productPrice = 134.95;
        productGenre.add("Action");
        productGenre.add("Thrillre");
        productGenre.add("Comedy");  
        productPurchased = 23;
    }
    
    @Test
    public void testGetPurchasedCount(){
        ProductPurchased productPurchasedTest = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchased);
        int expected = 23;
        int actual = productPurchasedTest.getPurchasedcount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetPurchasedCount(){
        ProductPurchased productPurchasedTest = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchased);
        int newPurchasedCount = 50;
        productPurchasedTest.setPurchasedcount(newPurchasedCount);
        int expected = 50;
        int actual = productPurchasedTest.getPurchasedcount();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCountUpPurchased(){
        ProductPurchased productPurchasedTest = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchased);
        productPurchasedTest.countUpPurchasedCount();
        int expected = 24;
        int actual = productPurchasedTest.getPurchasedcount();
        assertEquals(expected, actual);
    }
    
}
