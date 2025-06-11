package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 2, 3, 5, 4, 7);

        List<Integer> unique = list
                                .stream()
                                .distinct()
                                 .collect(Collectors.toList());

        System.out.println(unique);

        Integer count = list
                    .stream()
                    .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(count);



    }

}
