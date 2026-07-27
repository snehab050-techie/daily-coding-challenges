package src.main.BasicQuestions;


public class FindFactorial {
    int fact = 1;

    public int finFact(int n){
        if(n==0 || n==1){
            return fact;
        }
        else{
            fact = n * finFact(n-1);
        }
        return fact;
    }

    public static void main(String[] args) {

        FindFactorial f = new FindFactorial();

        //Without recursion
        int num = 5;
        int fact = 1;

        for(int i=num;i>0;i--){
            fact = fact * i;
        }
        System.out.println("Fact of num "+num+" is: "+fact);

        //Using recursion
        System.out.println("Using recursion: "+f.finFact(4));

    }

}
