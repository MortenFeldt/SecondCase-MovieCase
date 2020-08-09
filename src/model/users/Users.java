package model.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to hold list of User objects
 * @author Morten Feldt
 */

public class Users {
    
    private Map<Integer, User> users;

    public Users() {
        this.users = new HashMap();
    }

    public Users(Map<Integer, User> users) {
        this.users = users;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }
    
    public void addUser(User u){
        users.put(u.getId(), u);
    }

}
