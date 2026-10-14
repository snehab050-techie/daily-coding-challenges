package src.main.BasicQuestions.Java8_Features_Questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Move zero elements to the right side of the list, keeping non-zero elements order same
public class MoveZeroToRightOfList {
    public static void main(String[] args) {

       List<Integer> nums = List.of(1,0,-3,5,0,-8,0,9,0);

        List<Integer> collected = Stream.concat(nums.stream().filter(n->n!=0), nums.stream().filter(n->n==0))
                .collect(Collectors.toList());

        // .collect(Collectors.toList()); --> can be replaced with toList();

        System.out.println(collected);
    }
}
