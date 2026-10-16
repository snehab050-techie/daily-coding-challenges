package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
    static void main() {

        List<Integer> nums = Arrays.asList(50, 10, 40, 20, 30);

        // Sort in ASC order
        List<Integer> sortedNums = nums.stream()
                .sorted()
                .toList();

        sortedNums.forEach(System.out::println);

        System.out.println("---------");
        // Sort in DESC order
        List<Integer> res = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        res.forEach(System.out::println);
    }
}
