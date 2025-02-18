package com.demo.application.stream;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = List.of("aaaa","bdca","lknd","dzc","dddddddd");

       List filtredList= list.stream().filter(a-> a.length()>4).toList();
 System.out.println(filtredList.size());

    }
}
