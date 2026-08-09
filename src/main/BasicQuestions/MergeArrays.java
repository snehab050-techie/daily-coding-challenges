package src.main.BasicQuestions;

import java.util.Arrays;

//Program to merge arrays
public class MergeArrays {
    static void main() {

        int[] arr1 = {10,20,30,40};
        int[] arr2 = {50,60,70,80};

        // Using System.arraycopy() method
        int[] mergedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        System.out.println(Arrays.toString(mergedArray));
    }
}
