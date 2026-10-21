package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecHighestNum {
    static void main() {

        //Program to find the second-highest number
        List<Integer> nums = Arrays.asList(10, 50, 30, 50, 40, 20);
       java.lang.Integer res  = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList().get(1);

        System.out.println(res);

        // alternative
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        Integer secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1) // Skip the highest
                .findFirst()
                .orElseThrow();
        System.out.println(secondHighest);
    }
}
