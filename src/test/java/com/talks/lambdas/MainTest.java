package com.talks.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class MainTest {
    @Test
    public void sumList() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assert (28 == Main.sumList(numbers));
    }


    @Test
    public void sumDoubleEvenNumbers() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assert (24 == Main.sumDoubleEvenNumbers(numbers));
    }

    @Test
    public void justACornerCase() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assert (8 == Main.justACornerCase(numbers));
    }

    @Test
    public void sumDoubleEvenNumbersPerformance() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long start = System.nanoTime();

        try {
            int number = Main.sumDoubleEvenNumbersPerformance(numbers);
            assert(60 == number);
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken(s): " + (end - start) / 1.0e9);
        }

    }


    @Test
    public void showSteps() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assert (8 == Main.showSteps(numbers));
    }

    @Test
    public void infiniteStreams() throws Exception {
        assert (4060 == Main.infiniteStreams(10, 5));
    }
}