package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void testDivisibleByThree (int number) {
        assertEquals("Fizz", Fizzbuzz.fizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    public void testDivisibleByFive (int number) {
        assertEquals("Buzz", Fizzbuzz.fizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void testDivisibleByThreeAndFive (int number) {
        assertEquals("FizzBuzz", Fizzbuzz.fizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4,7,89})
    public void testDivisibleByAnyNumber (int number) {
        assertEquals(Integer.toString(number), Fizzbuzz.fizzBuzz(number));
    }


}