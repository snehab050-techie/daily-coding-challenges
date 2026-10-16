package src.main.BasicQuestions.Java8_Features_Questions.BasicQuestions;

import java.util.Arrays;
import java.util.List;

// print only the names that start with the letter "A".
public class FindNamesStartingWithA {
    static void main() {

        List<String> names = Arrays.asList("Asha", "Anil", "Ravi", "Arjun", "Neha", "Ajay");
        names.stream()
                .filter(name -> name.charAt(0) == 'A')
                .forEach(System.out::println);
    }
}
