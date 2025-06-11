package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;

public class DistWordExp2 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );

        long count = sentences.stream()
                .flatMap(e -> Arrays.stream(e.split(" ")))
                .distinct()
                .count();
        System.out.println(count);

    } //main

} //class
