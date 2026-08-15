package src.main.BasicQuestions;

//Program to print prime numbers from 1 to 50
public class PrimeNumber {
    static void main() {

        //Prime number is a unique natural number which is greater than 1
        // and is divided by only 1 and themselves

        int range = 50;
        int count = 0;

        for(int i=2;i<=50;i++){
            if(i % 1 == 0){  // This is always true - can skip
                count = 0;
                for(int j=2;j<=i;j++){
                    if(i % j == 0){
                        count++;
                    }
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }
    }
}
