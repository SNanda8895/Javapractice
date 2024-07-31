package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public static String fizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(number);
    }

    public static List<String> fizzBuzzList(int num){
          List<String> result = new ArrayList<>();
          for (int i = 1; i <= num; i++){
             result.add(fizzBuzz(i));
          }

      return result;

    }

}
