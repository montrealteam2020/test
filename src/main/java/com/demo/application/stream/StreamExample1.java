package com.demo.application.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 4, 6, 8, 3, 7);

        // Filter numbers greater than 4, sort them, and collect to a list
        List<Integer> filteredAndSorted = numbers.stream()
                .filter(n -> n > 4)       // Keep numbers greater than 4
                .sorted()                 // Sort them in ascending order
                .collect(Collectors.toList()); // Collect to a new list

        System.out.println(filteredAndSorted);
    }
}
