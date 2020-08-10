package model.mapper;

import model.interfaces.UserSessionMapper;
import model.products.Product;
import model.products.Products;
import model.users.User;
import model.users.UserSession;
import model.users.UserSessions;
import model.users.Users;

/**
 * Mapper to use for data conversion from files to User Session objects
 * @author Morten Feldt
 */

public class UserSessionMapperImpl implements UserSessionMapper{

    @Override
    public UserSessions getUserSessionFromContent(String content, Users users, Products products) {
        UserSessions userSessions = new UserSessions();
        String[] arrContent = content.split("\\n");
        for (int i = 0; i < arrContent.length; i++) {
            User user = getUserSessionFromContentLine(arrContent[i], users, products).getUser();
            Product product = getUserSessionFromContentLine(arrContent[i], users, products).getProduct();
            userSessions.addUserSession(user, product);
        }
        return userSessions;
    }

    @Override
    public UserSession getUserSessionFromContentLine(String contentLine, Users users, Products products) {
        String[] arrContentLine = contentLine.split(",");
        return new UserSession(users.getUsers().get(Integer.parseInt(arrContentLine[0].trim())), products.getProducts().get(Integer.parseInt(arrContentLine[1].trim())));
    }

}
