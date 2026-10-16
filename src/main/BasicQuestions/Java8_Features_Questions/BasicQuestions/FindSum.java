package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSum {
    static void main() {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        Integer res = nums.stream()
                .reduce(0, (a,b) -> (a+b));
        System.out.println(res);

        // above 0 - the initial value
        // a - the running result
        // b - the next value

        // Using wrapper Class method - Integer - Sum
        Optional<Integer> s = nums.stream()
                .reduce(Integer::sum);

        System.out.println(s);
    }
}
