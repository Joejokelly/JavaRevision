package org.revJune25.pract3;

import java.util.Arrays;
import java.util.List;

public class SortStreamExp1p {

    public static void main(String[] args) {
        System.out.println("SortStreamEXp1");

        List<Integer> nums = Arrays.asList(1,17, 54, 14, 14, 33, 45, -11);

        System.out.println("nums :" + nums);

        Integer secondsmallest = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondsmallest);

        /* second largest */

        Integer secondLargest = nums.stream()
                .distinct()
                .sorted((s1, s2) -> Integer.compare(s2,s1))
                    .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLargest);


    }

}
