package model.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about Products class object
 * @author Morten Feldt
 */
public class ProductsTest {
    private int productId = 0;
    private String productName = "";
    private int productYear = 0;
    private double productRating = 0.0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private Map<Integer, Product> products = new HashMap();
    
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
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        products.put(productTest.getId(), productTest);
    }
    
    @Test
    public void testGetProducts(){
        Products productsTest = new Products(products);
        int expected = 1;
        int actual = productsTest.getProducts().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetProducts(){
        Products productsTest = new Products();
        productsTest.setProducts(products);
        int expected = 1;
        int actual = productsTest.getProducts().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToProductsList(){
        Products productsTest = new Products(products);
        int newId = 789;
        Product productTestNew = new Product(newId, productName, productYear, productGenre, productRating, productPrice);
        productsTest.addProduct(productTestNew);
        int expected = 2;
        int actual = productsTest.getProducts().size();
        assertEquals(expected, actual);
    }
    
}
