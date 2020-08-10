package model.users;

import java.util.Map;
import model.products.Product;

/**
 * Class to hold user session based on data from file
 * @author Morten Feldt
 */

public class UsersSession {
    
    private Map<Integer, Product> userSessions;

    public UsersSession() {
    }

    public UsersSession(Map<Integer, Product> userSessions) {
        this.userSessions = userSessions;
    }

    public Map<Integer, Product> getUserSessions() {
        return userSessions;
    }

    public void setUserSessions(Map<Integer, Product> userSessions) {
        this.userSessions = userSessions;
    }
    
    public void addUserSession(User u, Product p){
        userSessions.put(u.getId(), p);
    }

}
