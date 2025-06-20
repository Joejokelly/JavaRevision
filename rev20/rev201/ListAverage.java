package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;

public class ListAverage {

    public static void main(String[] args) {
        System.out.println("ListAve");

        List<Integer> allnums = Arrays.asList(1,2,3,4,5);

        double avr = allnums
                    .stream()
                    .filter(n -> n % 2 ==0)
                    .mapToDouble(n -> n * 2.0)
                    .average()
                    .orElse(0);

        System.out.println(avr);


    }

}
