package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

public class SortStringAlphabetically {
    static void main() {

        //program to sort a string in alphabetical order
        String str = "program";

        str.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .forEach(c-> System.out.print(c));

        //program to sort list of each string in alphabetical order
        List<String> names = Arrays.asList("program","sneha","suhas","janu","apple");

    }
}
