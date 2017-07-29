package com.talks.lambdas;


import java.util.Arrays;
import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

        // Print the total of double of all the values
        Timeit.code( () ->
        System.out.println(
                numbers.parallelStream()
                .mapToInt(Sample4::doubleIt)
                .sum()
        ));

    }

    private static int doubleIt(int n){
        try{ Thread.sleep(1000);} catch (Exception ignore){};
        System.out.println("doubleIt " + n);
        return n * 2;
    }
}
