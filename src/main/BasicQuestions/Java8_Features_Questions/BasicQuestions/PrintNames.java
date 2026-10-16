package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

//Print names from a list
public class PrintNames {
    static void main() {

        List<String> names = Arrays.asList("Sneha","Janu","Suhas","Alis","Smith");

        // 3 different ways
        names.forEach(System.out::println);

        names.stream().forEach(System.out::println);

        names.stream().forEach(n-> System.out.println(n));
    }
}
