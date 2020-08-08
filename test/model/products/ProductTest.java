package model.products;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test class to test functionality about Product class object
 * @author Morten Feldt
 */
public class ProductTest {
    
    private String productName = "";
    private int productRating = 0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    
    @Before
    public void init(){
        productName = "Test Product 1";
        productRating = 1;
        productPrice = 134.95;
        productGenre.add("Action");
        productGenre.add("Thrillre");
        productGenre.add("Comedy");      
    }
    
    @Test
    public void testGetName(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        String expected = "Test Product 1";
        String actual = productTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetName(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        String newName = "Test Product 2";
        productTest.setName(newName);
        String expected = "Test Product 2";
        String actual = productTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetRating(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        int expected = 1;
        int actual = productTest.getRating();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetRating(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        int newRating = 2;
        productTest.setRating(newRating);
        int expected = 2;
        int actual = productTest.getRating();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPrice(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        double expected = 134.95;
        double actual = productTest.getPrice();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testSetPrice(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        double newPrice = 150.95;
        productTest.setPrice(newPrice);
        double expected = 150.95;
        double actual = productTest.getPrice();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testGetGenreList(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        int expected = 3;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetGenreList(){
        Product productTest = new Product(productName, null, productRating, productPrice);
        productTest.setGenre(productGenre);
        int expected = 3;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToGenreList(){
        Product productTest = new Product(productName, productGenre, productRating, productPrice);
        productTest.addGenre("TEST");
        int expected = 4;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
}
