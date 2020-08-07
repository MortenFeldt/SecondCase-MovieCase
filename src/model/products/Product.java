package model.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold information about Product object
 * @author Morten Feldt
 */

public class Product {
    
    private String name;
    private List<String> genre;
    private int rating;
    private double price;

    public Product(String name, int rating, double price) {
        this.name = name;
        genre = new ArrayList();
        this.rating = rating;
        this.price = price;
    }

    public Product(String name, List<String> genre, int rating, double price) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void addGenre(String newGenre){
        genre.add(newGenre);
    }

}
