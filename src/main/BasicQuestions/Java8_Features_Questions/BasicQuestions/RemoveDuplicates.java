package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

// Program to remove duplicate elements from the list
public class RemoveDuplicates {
    static void main() {

        List<Integer> nums = Arrays.asList(10, 20, 10, 30, 20, 40, 30);
        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
