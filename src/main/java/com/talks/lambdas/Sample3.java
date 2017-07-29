package com.talks.lambdas;


import java.util.Arrays;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

        // Find the double of the first even number that is greater than 3
        int result = 0;
        for(int n : numbers){
            if(n > 3 && n % 2 == 0){
                result = n * 2;
                break;
            }
        }

        System.out.println(result);

        System.out.println(
                numbers.stream()
                .filter(Sample3::isGT3)
                .filter(Sample3::isEven)
                .map(Sample3::doubleIt)
                .findFirst()

        );

    }

    private static boolean isGT3(int n){
        System.out.println("IsGT3 " + n);
        return n > 3;
    }

    private static boolean isEven(int n){
        System.out.println("isEven " + n);
        return n % 2 == 0;
    }

    private static int doubleIt(int n){
        System.out.println("doubleIt " + n);
        return n * 2;
    }
}
