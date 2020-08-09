package model.products;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about ProductsPurchased class object
 * @author Morten Feldt
 */
public class ProductsPurchasedTest {
    
    private String productName = "";
    private int productRating = 0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private ArrayList<ProductPurchased> productsPurchased = new ArrayList();
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
        ProductPurchased productTest = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchased);
        productsPurchased.add(productTest);
    }
    
    @Test
    public void testGetProductsPurchased(){
        ProductsPurchased productsTest = new ProductsPurchased(productsPurchased);
        int expected = 1;
        int actual = productsTest.getProductsPurchaed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetProductsPurchased(){
        ProductsPurchased productsTest = new ProductsPurchased();
        productsTest.setProductsPurchaed(productsPurchased);
        int expected = 1;
        int actual = productsTest.getProductsPurchaed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToProductsPurchasedList(){
        ProductsPurchased productsTest = new ProductsPurchased(productsPurchased);
        ProductPurchased productTestNew = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchased);
        productsTest.addProductPurchaed(productTestNew);
        int expected = 2;
        int actual = productsTest.getProductsPurchaed().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSortProductsPurchasedList(){
        int productPurchasedNew = 50;
        ProductPurchased productTestNew = new ProductPurchased(productName, productGenre, productRating, productPrice, productPurchasedNew);
        productsPurchased.add(productTestNew);
        ProductsPurchased productsTest = new ProductsPurchased(productsPurchased);
        Collections.sort(productsPurchased);
        int expected = 50;
        int actual = productsTest.getProductsPurchaed().get(0).getPurchasedcount();
        assertEquals(expected, actual);
    }
    
}
