package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLengthOfWordsInList {
    static void main() {

        // Find the length of each word in a list using Streams.
        List<String> names = Arrays.asList("Java", "Spring", "SQL");
        List<Integer> count = names.stream()
                .map(String::length)
                .toList();

        System.out.println(count);

        //Map each word to its lenght
        Map<String, Integer> map = names.stream()
                .collect(Collectors.toMap(Function.identity(),String::length));

        map.forEach((key,value) -> System.out.println(key+" - "+value));
    }
}
