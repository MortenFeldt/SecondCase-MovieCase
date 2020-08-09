package model.users;

import java.util.ArrayList;
import java.util.List;
import model.products.Product;

/**
 * Class to hold information about User object
 * @author Morten Feldt
 */

public class User {
    
    private int id;
    private String name;
    private List<Product> viewed;
    private List<Product> purchased;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.viewed = new ArrayList();
        this.purchased = new ArrayList();
    }

    public User(int id, String name, List<Product> viewed, List<Product> purchased) {
        this.id = id;
        this.name = name;
        this.viewed = viewed;
        this.purchased = purchased;
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

    public List<Product> getViewed() {
        return viewed;
    }

    public void setViewed(List<Product> viewed) {
        this.viewed = viewed;
    }

    public List<Product> getPurchased() {
        return purchased;
    }

    public void setPurchased(List<Product> purchased) {
        this.purchased = purchased;
    }
    
    public void addViewed(Product p){
        viewed.add(p);
    }
    
    public void addPurchased(Product p){
        purchased.add(p);
    }

}
