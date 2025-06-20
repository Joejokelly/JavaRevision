package org.revJune25.pract2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListNullExp1 {

    public static void main(String[] args) {
        System.out.println("ListNullExp1");

        List<String> list = Arrays.asList("apple", null, "bananc", null, "orange");

        List<String> filteredStream = list.stream()
                .map(s -> {
                    if (s == null) {
                        return "N/A";
                    }
                    return s.toUpperCase();
                })
                .collect(Collectors.toList());

        System.out.println(filteredStream);


        List<String> notNullList = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(notNullList);

        List<Optional<String>> optionalList = list.stream()
                                            .map(Optional::ofNullable)
                                            .collect(Collectors.toList());
        System.out.print(optionalList + " ");
        System.out.println("--------");

        //List<String> stringList = optionalList
                                    optionalList
                                    .stream()
                                     .flatMap(Stream::of)
                                     .forEach(System.out::println);






        //System.out.println(stringList);

    }

}