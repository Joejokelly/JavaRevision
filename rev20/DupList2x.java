package org.revision.June17.x2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupList2x {

    public static void main(String[] args) {
        System.out.println("Duplist2x");

        List<String> liststr = Arrays.asList("apple", "mango", "grapes", "apple", "apple" ,"mango");

        Map<String, Long> collectstr = liststr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println(collectstr);

        //distinct
        collectstr.entrySet()
                .stream()
                .filter(s -> s.getValue() > 1)
                .forEach(s -> System.out.println(s));
        //sort asc, desc
        System.out.println("sort asc");
        collectstr.entrySet()
                .stream()
                .filter(name -> name.getValue() > 1)
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("sort desc");
        collectstr.entrySet()
                .stream()
                .filter(name -> name.getValue() > 1)
               // .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
                .sorted(Map.Entry.<String, Long>comparingByKey().reversed())
                .forEach(s -> System.out.println(s));




    }
}
