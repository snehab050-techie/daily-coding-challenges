package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueNumbers {
    static void main() {

        //program to find unique numbers from a list
        List<Integer> nums = Arrays.asList(12,56,89,93,56,67,12,89,31);

        Map<Integer, Long> c = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       Map<Integer, Long> map = c.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach(
                (key, value) -> System.out.println(key)
        );

        //same logic applies for other data types
    }
}
