package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreqOfWordsInSen {
    static void main() {

        // Find the frequency of each word in a sentence
        String str = "java spring java sql spring java";

        String[] words = str.split(" ");
        Map<String,Long> res = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        res.forEach((key, value)-> System.out.println(key+" - "+value));

    }
}
