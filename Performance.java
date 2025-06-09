package org.example;

interface Speak { default  int talk() { return 7;  } }
interface  Sing { default  int talk() { return 5; } }


public class Performance implements Speak, Sing {

    @Override
    public int talk() {
        return Speak.super.talk();
        //return x.length;
    }

    public static void main(String[] args) {
        System.out.println(new Performance().talk());
    }
}
