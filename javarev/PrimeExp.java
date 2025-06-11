package org.revJune25.prac1;

import java.util.Arrays;
import java.util.List;

class PrExp {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(number);
        return true;
    }



}

public class PrimeExp {

    public static void main(String[] args) {
        System.out.println("string");

        //List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        List<Integer> numbers = Arrays.asList(4, 6, 8, 10, 11, 12, 13, 14, 15);

        PrExp p = new PrExp();
        boolean containsPrime = numbers.stream()
                .anyMatch(p::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);

    }

}
