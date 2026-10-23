package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    static void main() {

        //find duplicate nums
        List<Integer> nums = Arrays.asList(26,78,45,90,78,90);

        Map<Integer, Long> res = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        res.forEach((key,value) -> System.out.println(key+" - "+value));

        // find duplicate strings in a list

        List<String> words = List.of("hey","how","hey","are","you","you");
        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >=2 )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        map.forEach((key, value) -> System.out.println(key+" - "+value));

        //find duplicate words in a sentence

        String sentence = "I love java I love sql";

        Map<String, Long> dupliStr = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >=2 )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        dupliStr.forEach((key, value) -> System.out.println(key+" - "+value));

    }
}
