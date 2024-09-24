package org.example.collection;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .map(n -> n * n)    // Square each number
                .forEach(System.out::println); // Print each squared number

        System.out.println(numbers.stream().filter(each->each.equals(3)).findAny().orElse(null));
    }
}
