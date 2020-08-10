package model.interfaces;

import model.products.Products;
import model.users.UserSession;
import model.users.UserSessions;
import model.users.Users;

/**
 *
 * @author Morten Feldt
 */
public interface UserSessionMapper {
    public UserSessions getUserSessionFromContent(String content, Users users, Products products);   
    public UserSession getUserSessionFromContentLine(String contentLine, Users users, Products products);
}
