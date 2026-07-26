package src.main.BasicQuestions;

//Check if number is palindrome or not
public class ReverseANumber {
    static void main() {
        int num = 43899834;
        int originalNum = num;
        int rem;
        int rev = 0;

        while(num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(originalNum == rev){
            System.out.println(originalNum+" : is a palindrome number!");
        }
        else{
            System.out.println(originalNum+" : is not a palindrome number!");
        }
    }
}
