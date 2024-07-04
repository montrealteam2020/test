package com.demo.application.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "codes-list")
@Data
public class CodeMappingProperties {
    private Map<String, String> codesMap;

    public Map<String, String> getCodesMap() {
        return codesMap;
    }

    public void setCodesMap(Map<String, String> codesMap) {
        this.codesMap = codesMap;
    }
}
