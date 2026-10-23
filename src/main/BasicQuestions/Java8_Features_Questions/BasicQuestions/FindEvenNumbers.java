package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.List;

// Program to find even numbers from a list
public class FindEvenNumbers {
    static void main() {

        List<Integer> nums = List.of(10, 15, 20, 25, 30, 35, 40);

        List<Integer> evenNums = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        evenNums.forEach(System.out::println);

        // in one line
        System.out.println("------in one line----------");
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Program to find odd numbers
        System.out.println("-----odd numbers-------");
        nums.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
