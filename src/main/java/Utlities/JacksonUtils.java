package Utlities;

import POJO.BillingDetails;
import POJO.OmBillingDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {


    public static OmBillingDetails deserializeJson(InputStream file, OmBillingDetails omBillingDetails) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(file,omBillingDetails.getClass());
    }
    public static <T> T genericdeserializeJson(InputStream file, Class<T> T) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(file,T);
    }
}
