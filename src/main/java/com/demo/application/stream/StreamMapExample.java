package com.demo.application.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Convert each word to uppercase and collect to a new list
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)  // Convert each word to uppercase
                .collect(Collectors.toList()); // Collect to a new list

        System.out.println(upperCaseWords);
    }
}
