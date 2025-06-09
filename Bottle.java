package org.example;

import java.util.List;

public class Bottle {

    public static void main(String[] args) {
        System.out.println("Bottle.");

        var bottles = List.of("glass", "plastic", "can");
        for (int type = 1; type < bottles.size();) {
            System.out.print(bottles.get(type) + "-");
            if(type < bottles.size()) break;
        }
        System.out.print("end");


    }
}
