package com.abhi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MiddleElementFinder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(29, 30, 50, 56, 78, 89,23,67);
        
        Optional<Integer> middleElement = list.stream()
                                              .sorted()
                                              .skip((list.size() - 1) / 2)
                                              .findFirst();
                                              
        middleElement.ifPresent(System.out::println);
    }
}

