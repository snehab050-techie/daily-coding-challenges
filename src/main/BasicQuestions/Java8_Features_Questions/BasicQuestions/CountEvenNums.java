package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

// Count how many even numbers are in a list
public class CountEvenNums {
    static void main() {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Long c = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println(c);
    }
}
