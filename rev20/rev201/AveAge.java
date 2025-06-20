package org.revJune25.prac1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AveAge  {

    public static void main(String[] args) {
        System.out.println("AvgAge");

        List<String> str = Arrays.asList(
          "apple", "banana", "cheery", "grapefruit"
        );

        Optional<String> max = str.stream().max(Comparator.comparingInt(String::length));
        Optional<String> min = str.stream().min(Comparator.comparingInt(String::length));

        System.out.println(max);
        System.out.println(min);
    }


}
