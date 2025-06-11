package org.revJune25.pract2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MedianExp1 {

    public static void main(String[] args) {
        System.out.println("MedianExp1");

        List<Integer> numbers = Arrays.asList(5,2,1,3,4);
// code not correct.
//        OptionalDouble median = numbers.stream()
//                .sorted()
//                .mapToInt(Integer::intValue)
//                .collect(IntStatistics.summaryStatistics())

//                .getMedian();
//        System.out.println("Median: " + median.getAsDouble());


    }
}
