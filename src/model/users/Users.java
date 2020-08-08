package model.users;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold list of User objects
 * @author Morten Feldt
 */

public class Users {
    
    private List<User> users;

    public Users() {
        this.users = new ArrayList();
    }

    public Users(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public void addUser(User u){
        users.add(u);
    }

}
