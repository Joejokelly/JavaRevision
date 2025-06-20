package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySquareExp1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> nums = numbers.stream().map (x -> x * x).collect(Collectors.toList());

        System.out.println("numsb" + nums);




    }
}
