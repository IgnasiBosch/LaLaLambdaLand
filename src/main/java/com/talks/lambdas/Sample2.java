package com.talks.lambdas;


import java.util.Arrays;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Print the total of double of all the values
        int result = 0;
        for(int n : numbers){
            result += n * 2;
        }

        System.out.println(result);

        System.out.println(
                numbers.stream()
                .mapToInt(n -> n * 2)
                .sum()
        );

    }
}
