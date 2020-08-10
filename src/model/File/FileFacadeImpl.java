package model.File;

import java.io.FileNotFoundException;
import model.interfaces.FileFacade;
import model.mapper.ProductMapperImpl;
import model.mapper.UserMapperImpl;
import model.mapper.UserSessionMapperImpl;
import model.products.Product;
import model.products.Products;
import model.users.UserSessions;
import model.users.Users;

/**
 * Class to act as facade between files and controller. Class implements interface for methods.
 * @author Morten Feldt
 */

public class FileFacadeImpl implements FileFacade{
    
    ProductMapperImpl productMapper = new ProductMapperImpl();
    UserMapperImpl userMapper = new UserMapperImpl();
    UserSessionMapperImpl userSessionMapper = new UserSessionMapperImpl();
    
    @Override
    public String getFileType(String filename) {
        String[] arr = filename.split("\\.");
        return arr[arr.length - 1];
    }

    @Override
    public Products getProductDataFromFile(String filename) throws FileNotFoundException {
        Products products  = null;
        if(getFileType(filename).equalsIgnoreCase("txt")){
            txtFileReader fileReader = new txtFileReader();
            try {
                products = productMapper.getProductsFromContent(fileReader.readFromFile(filename));
            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException("Problem with file. Try again!");
            }
        }
        return products;
    }

    @Override
    public Users getUserDataFromFile(String filename, Products products) throws FileNotFoundException{
        Users users  = null;
        if(getFileType(filename).equalsIgnoreCase("txt")){
            txtFileReader fileReader = new txtFileReader();
            try {
                users = userMapper.getUsersFromContent(fileReader.readFromFile(filename), products);
            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException("Problem with file. Try again!");
            }
        }
        return users;
    }

    @Override
    public UserSessions getUserSessionDataFromFile(String filename, Users users, Products products) throws FileNotFoundException {
        UserSessions userSessions  = null;
        if(getFileType(filename).equalsIgnoreCase("txt")){
            txtFileReader fileReader = new txtFileReader();
            try {
                userSessions = userSessionMapper.getUserSessionFromContent(fileReader.readFromFile(filename), users, products);
            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException("Problem with file. Try again!");
            }
        }
        return userSessions;
    }
    
}
