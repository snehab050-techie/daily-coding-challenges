package src.main.BasicQuestions.Java8_Features_Questions;

public class CreateFunc {

    public static int func(int num){
        return 7+11 - num;
    }

    static void main() {

        // create a method which takes an input -
        //if input is 7 return 11
        // if input is 11 return 7
        // without using conditional statement if else

        System.out.println("Input is 7 - "+CreateFunc.func(7));
        System.out.println("Input is 11 - "+CreateFunc.func(11));
    }
}
