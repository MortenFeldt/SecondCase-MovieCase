package model.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Class used for reading data from TXT files
 * @author Morten Feldt
 */

public class txtFileReader extends FileReader {

    @Override
    String readFromFile(String filename) throws FileNotFoundException {
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream(filename);
            
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException(ex.getMessage());
        }

        StringBuilder contentString = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
        String lineOfContent;
        while ((lineOfContent = br.readLine()) != null) {
            contentString.append(lineOfContent).append("\n");
        }
        } catch (IOException ex) {
            throw new FileNotFoundException("Problem with file. Try again!");
        }
        return contentString.toString();
    }

    

}
