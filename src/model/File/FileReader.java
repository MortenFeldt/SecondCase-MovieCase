package model.File;

import java.io.FileNotFoundException;

/**
 * Abstract class with method used to read data from files, this class would be extended by specific format readers.
 * @author Morten Feldt
 */

abstract public class FileReader {
    abstract String readFromFile(String filename) throws FileNotFoundException;
}
