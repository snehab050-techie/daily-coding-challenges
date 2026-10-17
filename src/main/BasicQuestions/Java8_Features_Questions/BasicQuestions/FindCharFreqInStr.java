package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Program to count frequency of each character in a string
public class FindCharFreqInStr {
    static void main() {

        String str = "program";

        Map<Character, Long> res = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Function.identity()
        //It means: use the character itself as the grouping key.

 //       Collectors.counting()
//        It counts the items in each group. The result is a Long count, which is why we use Map<Character, Long>.

        System.out.println(res);
    }
}
