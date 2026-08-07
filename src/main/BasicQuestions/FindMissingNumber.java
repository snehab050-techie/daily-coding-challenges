package src.main.BasicQuestions;

// Find missing number
public class FindMissingNumber {
    static void main() {
        int[] arr = {1,2,4,5}; //missing is 3
        int n=5;

        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for(int num: arr){
            actualSum+=num;
        }

        int missingNum = expectedSum - actualSum;
        System.out.println("Missing number is: "+missingNum);
    }
}
