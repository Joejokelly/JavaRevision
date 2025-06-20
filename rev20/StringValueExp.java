package org.revision.June25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringValueExp {

    public static HashMap<String, Integer> map;

    //new HashMap<String, Integer>();


    public static void main(String[] args) {
        System.out.println("String exp");

        /* Exc, De, Pxc1 */
        /* Exc:3, De:2, Pxc1:4 */

        map = new HashMap<String, Integer>();

        String str1 = "Exc";
        int len1 = str1.length();
        System.out.println(len1);

        String str2 = "Xe";
        int len2 = str2.length();
        System.out.println(len2);

        String str3 = "Pxc1";
        int len3 = str3.length();
        System.out.println(len3);

        //Map<String, Integer> map;

        //map = new HashMap<String, Integer>();


        map.put(str1, len1);
        map.put(str2, len2);
        map.put(str3, len3);

        System.out.println(map);

        sortbyKey();




    }

    public static void sortbyKey() {
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println(sortedMap);

    }

}
