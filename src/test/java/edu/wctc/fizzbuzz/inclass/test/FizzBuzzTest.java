package edu.wctc.fizzbuzz.inclass.test;

import org.junit.jupiter.api.Test;

import static edu.wctc.fizzbuzz.inclass.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://kata-log.rocks/fizz-buzz-kata

Write a program that prints one line for each number from 1 to 100
For multiples of three print Fizz instead of the number
For the multiples of five print Buzz instead of the number
For numbers which are multiples of both three and five print FizzBuzz instead of the number
 */
public class FizzBuzzTest {
    @Test
    void one() {
        assertEquals("1", fizzBuzz(1));
    }

    @Test
    void two() {
        assertEquals("2", fizzBuzz(2));
    }

    @Test
    void three() {
        assertEquals("Fizz", fizzBuzz(3));
    }

    @Test
    void five() {
        assertEquals("Buzz", fizzBuzz(5));
    }

    @Test
    void six() {
        assertEquals("Fizz", fizzBuzz(6));
    }

    @Test
    void ten() {
        assertEquals("Buzz", fizzBuzz(10));
    }

    @Test
    void fifteen() {
        assertEquals("FizzBuzz", fizzBuzz(15));
    }

    @Test
    void thirty() {
        assertEquals("FizzBuzz", fizzBuzz(30));
    }
}
