package org.revJune25.pract2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
  public static void main(String[] args) {
      System.out.println("Longest");

      List<String> strings = Arrays.asList("apple", "organgf", "grapfruits", "kiwid", "pmorogra");

      String longStr = strings.stream()
              .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
              .orElse(null);

    System.out.println(longStr);

    String longestString = strings.stream()
            .max(Comparator.comparing(String::length))
            .orElse(null);

    System.out.println(longestString);

  }

}
