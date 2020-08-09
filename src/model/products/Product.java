package model.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold information about Product object
 * @author Morten Feldt
 */

public class Product {
    
    private int id;
    private String name;
    private int year;
    private List<String> genre;
    private double rating;
    private double price;

    public Product(int id, String name, int year, double rating, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        genre = new ArrayList();
        this.rating = rating;
        this.price = price;
    }

    public Product(int id, String name, int year, List<String> genre, double rating, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
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
