package org.revision.June17.x2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupList1x {

    public static void main(String[] args) {
        System.out.println("DupList1x");

        List<String> dupList = Arrays.asList("apple", "banana",
                "grapes", "candle", "pomegrapne", "kiwiw", "apple", "banana");

        Map<String, Long> collectMap = dupList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collectMap);

        collectMap
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .sorted(Map.Entry.comparingByKey())
                .forEach(s -> System.out.println("orig :" + s));


        collectMap
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                //.sorted(Map.Entry.comparingByKey().reversed())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(s -> System.out.println("reversed :" + s));


        Stream<Map.Entry<String, Long>> sortedMap = collectMap.entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed());

        //System.out.println("Sorted nao :" + sortedMap.toString());

        sortedMap.forEach(entry ->
                System.out.println(entry.getKey() + " = " + entry.getValue()));



//        collectMap
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() > 1)
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(s -> System.out.println(s));




    }

}
