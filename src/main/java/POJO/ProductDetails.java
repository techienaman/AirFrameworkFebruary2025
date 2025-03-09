package POJO;

import Utlities.JacksonUtils;

import java.io.IOException;
import java.io.InputStream;

public class ProductDetails {

    private int id;
    private String name;

    public ProductDetails() {
    }

    public ProductDetails(int id) throws IOException {
        InputStream inputStream1=getClass().getClassLoader().getResourceAsStream("product.json");
        ProductDetails[] productDetails= JacksonUtils.genericdeserializeJson(inputStream1,ProductDetails[].class);
        for(ProductDetails productDetails1:productDetails) {
            if (productDetails1.getId() == id) {
                this.id = productDetails1.getId();
                this.name = productDetails1.getName();
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
