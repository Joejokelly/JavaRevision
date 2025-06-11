package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;

/* Squares of even nos in list */

public class SumSquareEvenNosExp1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //numbers
                //.stream()
                //.filter(e -> e.length() % 2 == 0)
        int sum = numbers.stream()
                .mapToInt(e -> e * e)
                .filter(e -> e % 2 == 0)
                .sum();
        System.out.println(sum);




    }
}
