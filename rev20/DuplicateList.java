package org.revision.June17.x2025;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateList {

  public static void main(String[] args) {
      System.out.println("Dupl List");

      List<String> duplist = Arrays.asList("apple", "orange", "apple", "pomegrante", "grapes", "banana", "grapes");

      System.out.println(duplist);
      //Sort on name //
      Map<String, Long> maplist = duplist.stream()
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      System.out.println(maplist);

      //duplist.stream().collect(Collectors.groupingBy(name -> name.startsWith("A"), Collectors.counting()));
        //Sort
        //Grouping
        //Mapset


      Map<String, Long> collectMap = duplist.stream()
              .collect(Collectors.groupingBy(name -> name, TreeMap::new, Collectors.counting()));

      System.out.println(collectMap);

      //duplist.stream()
              //.collect(Collectors.toSet())

      maplist.entrySet()
              .stream()
              .filter(entry -> entry.getValue() > 1)
              .forEach(x -> System.out.println(x.getKey()));

     collectMap.entrySet()
             .stream()
             .filter(x -> x.getValue() > 1)
             .forEach(x -> System.out.println(x.getKey()));


  }
  
  
  

}
