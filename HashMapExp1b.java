package org.revision.June25;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class HashMapExp1b {

    public static void main(String[] args) {
        System.out.println("HashMapExp1b");
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 4);
        map.put("key5", 5);

        map
            .entrySet()
            .stream()
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet())
                    .forEach(System.out::println);
    }
}
