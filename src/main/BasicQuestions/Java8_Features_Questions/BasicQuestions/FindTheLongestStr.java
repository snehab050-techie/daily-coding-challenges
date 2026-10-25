package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheLongestStr {
    static void main() {

        //program to find the longest string in a list
        List<String> res = Arrays.asList("Hey","hello","language","programming","machine");

        Map<String, Integer> map = res.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        map.entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                        .stream()
                                .forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));

    }
}
