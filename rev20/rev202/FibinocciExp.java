package org.revJune25.pract2;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FibinocciExp {

    public static void main(String[] args) {
        System.out.println("FibinocciExp");
        LongStream fibonacci = Stream.iterate(
                        new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .mapToLong(f -> f[0]);
// Print first 10 Fibonacci numbers
        fibonacci.limit(10).forEach(System.out::println);

    }

}
