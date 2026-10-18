package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatChar {
    static void main() {

        //Program to find the first non-repeating character using Java 8 features
        String str = "swiss";

        Character res = str.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);

        System.out.println(res);

        //Program to find the first repeating character in a string using Java 8 features
        Character nch = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(nch);
    }
}
