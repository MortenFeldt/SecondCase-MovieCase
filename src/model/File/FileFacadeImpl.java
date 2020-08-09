package model.File;

import model.interfaces.FileFacade;
import model.products.Products;
import model.users.Users;

/**
 * Class to act as facade between files and controller. Class implements interface for methods.
 * @author Morten Feldt
 */

public class FileFacadeImpl implements FileFacade{
    
    @Override
    public String getFileType(String filename) {
        String[] arr = filename.split("\\.");
        return arr[arr.length - 1];
    }

    @Override
    public Products getProductDataFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Users getUserDataFromFile(String filename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
