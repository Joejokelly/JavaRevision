package org.revision.June17.x2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top2Salaries {
  public static void main(String[] args) {
      List<Integer> listnums = Arrays.asList(3500, 200, 5600, 2400);

      listnums.stream()
              .sorted(Comparator.reverseOrder())
              .limit(2)
              .forEach(x -> System.out.println(x));

      listnums.stream()
                      .sorted(Comparator.naturalOrder())
                              .limit(2)
                                      .forEach(System.out::println);

      listnums.stream()
              .sorted(Comparator.reverseOrder())
              .limit(2)
              .forEach(System.out::println);

      listnums.stream()
              .sorted((a, b) -> (b -a))
              .limit(2)
              .forEach(System.out::println);



  }

}
