package src.main.BasicQuestions;

//Program to count vowels in a String
public class CountVowels {

    static void main() {

        String str = "apiple";
        char[] c= str.toCharArray();
        int count = 0;

        for(int i=0;i<c.length;i++){
            if(c[i] == 'a' || c[i]=='e' || c[i]=='i' || c[i] =='o' || c[i] == 'u'){
                count++;
            }
        }
        System.out.println("Vowels count in : "+str+" is : "+count);
    }
}


