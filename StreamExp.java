package org.example;

import java.util.Set;

public class StreamExp {

    public static void main(String[] args) {
        System.out.println("Streamexp");

        //Streem.of(1,3,5,7,9,11)

        Set<Integer> iSeq = Set.of(1,9,4,3,7, 6);
        System.out.println("takewhiel");
        iSeq.stream()
                .takeWhile(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n + " "));

        System.out.println("dropwhoie");
        iSeq.stream()
                .dropWhile(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n + " "));




    }
}
