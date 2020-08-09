package model.mapper;

import java.util.ArrayList;
import model.interfaces.UserMapper;
import model.products.Product;
import model.products.Products;
import model.users.User;
import model.users.Users;

/**
 * Mapper to use for data conversion from files to User objects
 * @author Morten Feldt
 */

public class UserMapperImpl implements UserMapper{
    
    @Override
    public Users getUsersFromContent(String content, Products products){
        Users users = new Users();
        String[] arrContent = content.split("\\n");
        for (int i = 0; i < arrContent.length; i++) {
            users.addUser(getUserFromContentLine(arrContent[i], products));
        }
        return users;
    }

    @Override
    public User getUserFromContentLine(String contentLine, Products products) {
        String[] arrContentLine = contentLine.split(",");
        String[] arrViewed = arrContentLine[2].split(";");
        String[] arrPurchased = arrContentLine[3].split(";");
        User user = new User(Integer.parseInt(arrContentLine[0]), arrContentLine[1]);
        for (int i = 0; i < arrViewed.length; i++) {
            user.addViewed(products.getProducts().get(Integer.parseInt(arrViewed[i].trim())));
        }
        for (int j = 0; j < arrPurchased.length; j++) {
            user.addPurchased(products.getProducts().get(Integer.parseInt(arrPurchased[j].trim())));
        }
        return user;
    }

}
