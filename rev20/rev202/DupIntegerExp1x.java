package org.revJune25.pract2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupIntegerExp1x {

    public static void main(String[] args) {
        System.out.println("Dup Integers");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);

// Count the occurrences of each number
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        System.out.println(frequencyMap);

// Filter out non-duplicate numbers
        numbers.stream()
                .filter(number -> frequencyMap.get(number) == 1)
                .forEach(System.out::println);


    }

}
