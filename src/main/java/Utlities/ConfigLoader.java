package Utlities;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.util.Properties;

public class ConfigLoader {

    private static ConfigLoader configLoader;
    private static  Properties properties;


    private ConfigLoader(){
        properties=PropertiesUtils.loadProperties();

    }

    public static ConfigLoader getProperty(){
        if(configLoader==null){
            configLoader=new ConfigLoader();
        }
        return configLoader;
    }


    public String getBaseURL(){
        String url=properties.getProperty("baseUrl");
        return url;
    }
}
