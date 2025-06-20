package org.revision.June25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupList1b {

    public static void main(String[] args) {
        System.out.println("DupList1b");

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> resulst = findSetDuplicate(list);

        System.out.println(resulst);

    }

    static Set<Integer> findSetDuplicate(List<Integer> list) {

        Set<Integer> item = new HashSet<Integer>();

        return list.stream()
                .filter( x -> !item.add(x))
                .collect(Collectors.toSet());
    }

}
