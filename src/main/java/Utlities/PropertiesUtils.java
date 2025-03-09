package Utlities;

import org.testng.annotations.Optional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesUtils {



    public static Properties loadProperties(){
        Properties properties=new Properties();
        try{
           // BufferedReader bufferedReader=new BufferedReader(new FileReader("src/test/resources/config"+env+".properties"));
            BufferedReader bufferedReader=new BufferedReader(new FileReader("src/test/resources/configdev.properties"));
            properties.load(bufferedReader);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return properties;
    }

}
