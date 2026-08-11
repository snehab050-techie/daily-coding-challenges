package src.main.BasicQuestions;

import java.util.Arrays;

//Program to find second-largest element in an array
public class SecondLargestNumber {
    static void main() {
        int[] nums = {123,567,943,627,398};

        //Using Arrays sort method
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int position = nums.length - 2;
        System.out.println("Second largest element is: "+nums[position]);

        //Without using built in methods


    }
}
