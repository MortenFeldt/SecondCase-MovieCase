package model.interfaces;

import model.products.Products;
import model.users.User;
import model.users.Users;

/**
 *
 * @author Morten
 */
public interface UserMapper {
    public Users getUsersFromContent(String content, Products products);
    public User getUserFromContentLine(String contentLine, Products products);
}
