package edu.wctc.fizzbuzz.inclass;

import static edu.wctc.fizzbuzz.inclass.FizzBuzz.fizzBuzz;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
}
