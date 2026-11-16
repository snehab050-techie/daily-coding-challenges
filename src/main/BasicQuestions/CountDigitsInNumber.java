package src.main.BasicQuestions;

// Count the number of digits: Eg - 123456 - 6 digits

public class CountDigitsInNumber {
    static void main() {

        int num = 786786450;

        // way 1 - convert to string and then char -->hashmap technique
        //way 2 - divide num by 10 and increment the count
        
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
