package model.users;

import model.products.Product;

/**
 * Class to hold information about User Session object
 * @author Morten Feldt
 */

public class UserSession {
    
    private User user;
    private Product product;

    public UserSession(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
