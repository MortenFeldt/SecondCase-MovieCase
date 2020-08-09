package model.products;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about Products class object
 * @author Morten Feldt
 */
public class ProductsTest {
    
    private String productName = "";
    private int productRating = 0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    private ArrayList<Product> products = new ArrayList();
    
    @Before
    public void init(){
        productName = "Test Product 1";
        productRating = 1;
        productPrice = 134.95;
        productGenre.add("Action");
        productGenre.add("Thrillre");
        productGenre.add("Comedy"); 
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        products.add(productTest);
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
        Product productTestNew = new Product(productName, productGenre, productRating, productPrice);
        productsTest.addProduct(productTestNew);
        int expected = 2;
        int actual = productsTest.getProducts().size();
        assertEquals(expected, actual);
    }
    
}
