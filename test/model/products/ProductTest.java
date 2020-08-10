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
    private int productId = 0;
    private String productName = "";
    private int productYear = 0;
    private double productRating = 0.0;
    private double productPrice = 0.0;
    private ArrayList<String> productGenre = new ArrayList();
    
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
    }
    
    @Test
    public void testGetId(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        int expected = 123;
        int actual = productTest.getId();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetId(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        int newId = 789;
        productTest.setId(newId);
        int expected = 789;
        int actual = productTest.getId();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        String expected = "Test Product 1";
        String actual = productTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetName(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        String newName = "Test Product 2";
        productTest.setName(newName);
        String expected = "Test Product 2";
        String actual = productTest.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetYear(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        int expected = 2010;
        int actual = productTest.getYear();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetYear(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        int newYear = 2015;
        productTest.setYear(newYear);
        int expected = 2015;
        int actual = productTest.getYear();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetRating(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        double expected = 1.1;
        double actual = productTest.getRating();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testSetRating(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        double newRating = 2.2;
        productTest.setRating(newRating);
        double expected = 2.2;
        double actual = productTest.getRating();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testGetPrice(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        double expected = 134.95;
        double actual = productTest.getPrice();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testSetPrice(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        double newPrice = 150.95;
        productTest.setPrice(newPrice);
        double expected = 150.95;
        double actual = productTest.getPrice();
        assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testGetGenreList(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        int expected = 3;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetGenreList(){
        Product productTest = new Product(productId, productName, productYear, null, productRating, productPrice);
        productTest.setGenre(productGenre);
        int expected = 3;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddToGenreList(){
        Product productTest = new Product(productId, productName, productYear, productGenre, productRating, productPrice);
        productTest.addGenre("TEST");
        int expected = 4;
        int actual = productTest.getGenre().size();
        assertEquals(expected, actual);
    }
}
