package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqWordExp1 {

    public static void main(String[] args) {
        System.out.println("FreqWordExp1");

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partitioned = nums
                                                .stream()
                                                .collect(Collectors.partitioningBy(n -> n % 2 ==0));

        List<Integer> even = partitioned.get(true);
        List<Integer> odd = partitioned.get(false);

        System.out.println("even" + even);
        System.out.println("odd" + odd);



    }

}
