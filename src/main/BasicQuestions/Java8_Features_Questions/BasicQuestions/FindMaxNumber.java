package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
    static void main() {

        List<Integer> nums = Arrays.asList(12, 45, 7, 89, 34, 67);
        Integer max = nums.stream()
                .max(Integer::compareTo)
                .get();

        // .get() -
        // Extracts the result from an Optional, which is a container that may or may not hold a value.
        // Calling .get() directly can throw an exception if the list is empty.
        // Below is the safer approach

        System.out.println(max);

        // to find the min number
        Optional<Integer> min = nums.stream()
                .min(Integer::compareTo);
        min.ifPresent(System.out::println);

        // alternative solution
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        int maxNum = numbers.stream().max(Integer::compare).orElseThrow();
        int minNum = numbers.stream().min(Integer::compare).orElseThrow();

        System.out.println("Max: " + max + ", Min: " + min);
    }
}
