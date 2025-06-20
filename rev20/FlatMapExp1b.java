package org.revision.June17.x2025;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp1b {

    public static void main(String[] args) {
        System.out.println("Flatmapexp1`");

        List<List<String>> nested = Arrays.asList(
          Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("d")
        );

        System.out.println(nested);

       List<String> flatmap = nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatmap);


        nested.stream().flatMap(x -> x.stream()).forEach(x -> System.out.println(x));







    }

}
