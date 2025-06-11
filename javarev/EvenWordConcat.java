package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenWordConcat {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        // Write your code here

        String result = words.stream()
                .filter(e -> e.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());
        System.out.println(result);


    }

}
