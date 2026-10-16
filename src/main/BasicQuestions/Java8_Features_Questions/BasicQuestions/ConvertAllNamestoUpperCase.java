package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertAllNamestoUpperCase {
    static void main() {

        List<String> names = Arrays.asList("asha", "ravi", "neha", "sneha");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        // Lambda can be replaced with method reference
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
