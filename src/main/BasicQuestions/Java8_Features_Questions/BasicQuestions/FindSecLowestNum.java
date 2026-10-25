package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

public class FindSecLowestNum {
    static void main() {

        //program to find the sec lowest num from a list
        List<Integer> nums = Arrays.asList(18,92,98,34,56,15,19,56,71,23,10,17);
        Integer res = nums.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(res);
    }
}
