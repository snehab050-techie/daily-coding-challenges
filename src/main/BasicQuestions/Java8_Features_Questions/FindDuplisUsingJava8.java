package src.main.BasicQuestions.Java8_Features_Questions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplisUsingJava8 {
    static void main() {

        //Find duplicate elements in a list using Java 8 features
        List<Integer> nums= List.of(10,20,40,20,35,67,45,35);

       Set<Integer> res = nums.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                        .entrySet().stream()
                       .filter(e->e.getValue()>1).map(n-> n.getKey())
                       .collect(Collectors.toSet());

        System.out.println(res);
    }
}
