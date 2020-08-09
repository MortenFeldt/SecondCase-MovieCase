package model.interfaces;

import model.products.Products;
import model.users.Users;

/**
 *
 * Interface methods used for FileFaceImpl class
 * @author Morten Feldt
 */
public interface FileFacade {
    public String getFileType(String filename);
    public Products getProductDataFromFile(String filename);
    public Users getUserDataFromFile(String filename);
}
