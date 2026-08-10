package src.main.BasicQuestions;

// Program to swap two numbers without a third variable
public class SwapNumbers {
    static void main() {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is: "+a+" b is: "+b);
    }
}
