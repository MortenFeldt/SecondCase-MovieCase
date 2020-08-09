package model.interfaces;

import java.io.FileNotFoundException;
import model.products.Products;
import model.users.Users;

/**
 *
 * Interface methods used for FileFaceImpl class
 * @author Morten Feldt
 */
public interface FileFacade {
    public String getFileType(String filename);
    public Products getProductDataFromFile(String filename) throws FileNotFoundException;
    public Users getUserDataFromFile(String filename, Products products) throws FileNotFoundException;
}
