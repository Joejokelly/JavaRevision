package org.revJune25.pract2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramExp1 {

    public static void main(String[] args) {
        System.out.println("Angaramexp1");
        List<String> words = Arrays.asList("listen", "silent", "hello",
                "world", "night", "thing");

        Map<String, List<String>> anagrams = words.stream()
                .collect(Collectors.groupingBy(str -> {
                    char[] chars = str.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
        System.out.println("Anagrams: " + anagrams);

    }

}
