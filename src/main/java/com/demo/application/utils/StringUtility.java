package com.demo.application.utils;

import io.micrometer.common.util.StringUtils;

public class StringUtility {

    public static void main(String[] args) {

        String test=null;
       if (StringUtils.isBlank(test))
           System.out.println("Is null");
       else
           System.out.println("Is not null");
    }
}
