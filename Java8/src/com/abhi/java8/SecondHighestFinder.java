package com.abhi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestFinder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(29, 30, 40, 56, 78, 89);
        
        Optional<Integer> secondHighest = list.stream()
                                              .sorted((a, b) -> b - a) // Sort in reverse order
                                              .skip(1) // Skip the highest element
                                              .findFirst(); // Find the first element of the remaining
        
        secondHighest.ifPresent(System.out::println);
    }
}

