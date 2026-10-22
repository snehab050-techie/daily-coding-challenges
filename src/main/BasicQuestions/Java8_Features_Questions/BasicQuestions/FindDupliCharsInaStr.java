package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupliCharsInaStr {
    static void main() {

        // Program to find duplicate characters and their counts in a string

        String str = "bbottleee";
        Map<Character, Long> res = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch-> str.indexOf(ch) != str.lastIndexOf(ch))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        res.forEach((key, value) -> System.out.println(key+" - "+value));

        //tried alternate
        //find duplicate char in a str

        String s = "swissi";

        Map<Character, Long> map = s.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >=2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map);
    }
}
