package org.revJune25.pract2;

import java.util.Arrays;
import java.util.List;

public class charOccurExp1x {

    public static void main(String[] args) {
        System.out.println("charicc");
        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "melon", "adrian");
        char target = 'a';
        long occurrences = strings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(c -> c == target)
                .count();
        System.out.println("Occurrences of '" + target + "': " + occurrences);

    }

}
