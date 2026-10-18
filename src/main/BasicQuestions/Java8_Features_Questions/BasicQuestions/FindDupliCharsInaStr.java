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
    }
}
