package src.main.BasicQuestions;

//Program to print fibonacci series
// a1 = 0, a2 = 1 --> fixed numbers to start series
// Print: 0,1,1,2,3,5,8,13,21,34,55,..
// Question- Print fibonacci series upto nth number
public class Fibonacci {
    static void main() {

        int n = 9;
        int a1 = 0;
        int a2 = 1;
        int res = 0;

        System.out.print(a1+", "+a2); // 0 & 1 are already on index 0 and 1
        for(int i=1;i<=n;i++){
           res = a1 + a2;
           a1 = a2;
           a2 = res;
           System.out.print(" ,"+res);
        }
    }
}
