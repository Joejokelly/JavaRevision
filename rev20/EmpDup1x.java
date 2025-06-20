package org.revision.June17.x2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

public class EmpDup1x {

    public static void main(String[] args) {
        System.out.println("EmpDup1x");

        List<String> lst = new ArrayList<String>();

        List<String> aslist = Arrays.asList("Joe", "Joe", "Fancei", "Becker", "Becker", "Becker", "Fanmcis", "Deepal");

        //lst.addAll("Joe", "Joe", "Francis", "Deeal", "devon");

        //java.util.Map<String, Long> counts = aslist.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        java.util.Map<String, Long> counts = aslist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(counts);

        counts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate: " + entry.getKey() + " -> " + entry.getValue() + " times"));

        counts.entrySet().stream()
                .filter(s -> s.getValue() > 1)
                .forEach( s -> System.out.println("Dupol" + s.getKey() + " " + s.getValue()));


    }

}
