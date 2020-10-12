package UsayCompare.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    public static Properties properties = new Properties();
    FileInputStream fileInputStream = null;
    File file;

    // Reusable method for to get the property data from config.properties file
    public String getProperty(String key) {
        file = new File("src/test/resources/testData/config.properties");
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
