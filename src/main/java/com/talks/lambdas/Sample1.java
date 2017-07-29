package com.talks.lambdas;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Iterate and print number values
        numbers.forEach(System.out::println);
    }
}
