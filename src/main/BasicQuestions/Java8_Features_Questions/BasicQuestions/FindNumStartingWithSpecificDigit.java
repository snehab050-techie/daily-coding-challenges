package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

public class FindNumStartingWithSpecificDigit {

    static void main() {

        //Program to find a number starting with specific digit

        List<Integer> nums = Arrays.asList(23,78,45,98,48,30,41);

        nums.stream()
                .filter(n -> n.toString().startsWith("4"))
                .forEach(System.out::println);

    }
}
