package src.main.BasicQuestions;

import java.util.Arrays;

// Program to check if the number is Armstrong Number
// If the length of the numbers are same & the count of each number in both in nums are equal
// Eg: n1 =78634, n2 = 37684
public class ArmstrongNumber {
    static void main() {

        Integer n1 = 78614;
        Integer n2 = 37684;

        String s1 = n1.toString();
        String s2 = n2.toString();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if(arr1.length != arr2.length){
            System.out.println("Not armstrong numbers");
        }
        else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not Armstrong numbers");
            }
        }
    }
}
