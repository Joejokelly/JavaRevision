package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorCountingExp {

    public static void main(String[] args) {
        System.out.println("collectosr counting");

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple", "pear" );

        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(wordFrequency);

    }

}
