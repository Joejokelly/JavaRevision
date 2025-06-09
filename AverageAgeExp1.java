package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;

public class AverageAgeExp1 {

    public static void main(String[] args) {
        System.out.println("Age");

        List<Integer> intarr = Arrays.asList(20, 25, 19,27, 31, 41);

       double avg =  intarr.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(avg);

    }

}
