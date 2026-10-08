package src.main.BasicQuestions;

//Program to find the sum and average of array elements
public class SumAndAvgOfArrEle {
    static void main() {

	// Without using built in APIs from JAVA

        int[] nums = {10,20,30,40};

        int sum = 0;
        for(int ele : nums){
            sum +=ele;
        }
        System.out.println(sum);

        //Using stream()
        System.out.println(Arrays.stream(nums).sum());

        // Without using built in APIs from JAVA
        int avg = sum / nums.length;
        System.out.println(avg);

        // Using streams
        System.out.println(Arrays.stream(nums).average());

    }
}
