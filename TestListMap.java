package org.revision.June25;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Hosting {
    private String Id;
    private String name;

    public Hosting() {

    }

    public Hosting(String id, String name) {
        Id = id;
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestListMap {

    public static void main(String[] args) {
        System.out.println("TestListMap");

        List<Hosting> host = Arrays.asList(
                new Hosting("1001", "hst1"),
                new Hosting( "1002",  "hist2"),
                new Hosting("1003", "hst3")
        );

        for (Hosting hst : host) {
            System.out.println(hst.getId() + " " + hst.getName());

        }

        Map<String, String> map = host
                            .stream()
                            .collect(Collectors.toMap(Hosting::getId, Hosting::getName));

        System.out.println(map);



    }

}
