package com.demo.application.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class MyComponent {

    @Value("${my.property.name}")
    private String myProperty;

    @Value("${codes-list.codesMap.Y}")
    private String code;


    public void printProperty() {
        System.out.println("Property value: " + myProperty);
    }

    public String getCode(){
        return code;
    }

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
