package org.revision.June25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringKeyExp1 {

    public static HashMap<String, Integer> map;

    public static void main(String[] args) {
        System.out.println("Stringexp");


        map = new HashMap<String, Integer>();
        String str1 = "Expl1";
        int length1 = str1.length();

        //map = new HashMap<String, Integer>();

        String str2 = "Expxxx2";
        int length2 = str2.length();

        String str3 = "Expt3";
        int length3 = str3.length();

        map.put(str1, length1);
        map.put(str2, length2);
        map.put(str3, length3);

        System.out.print(map);
        sortByKey();

    }

    private static void sortByKey() {

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2)  -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);

    }
}