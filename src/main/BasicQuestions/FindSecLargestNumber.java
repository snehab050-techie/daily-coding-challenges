package src.main.BasicQuestions;

import java.util.HashSet;
import java.util.Set;

//Program to find largest number in an array
public class FindSecLargestNumber {
    static void main() {

        int[] nums = {10,30,45,72,88,85}; // ans = 72
        int max = 0;

        // Looping to fetch max element from the array
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
//        System.out.println(max);
        Set<Integer> s = new HashSet<>();
        for(int ele: nums){
            if(ele != max){  // removing highest element and adding remain ele to set
                s.add(ele);
            }
        }

        //Finding sec max element
        int secMax = 0;
        for(int ele: s){
            if(ele > secMax){
                secMax = ele;
            }
        }
        System.out.println("Second highest element is: "+secMax);
    }
}
