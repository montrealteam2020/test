package com.demo.application.controller;

import com.demo.application.properties.CodeMappingProperties;
import com.demo.application.properties.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private MyComponent prop;
    @Autowired
    private CodeMappingProperties codeMappingProperties;
    @GetMapping("/user")
    String getUserProperties(){
       return prop.getCode()+" "+codeMappingProperties.getCodesMap();
    }


}
