package src.main.BasicQuestions;

public class CheckIfEvenNumberOrOdd {
    static void main() {
        int num = 19;

        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        // one line - ternary operator
        String res = (num%2 == 0) ? "Even number" : "Odd Number";
        System.out.println(res);
    }
}
