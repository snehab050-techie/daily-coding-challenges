package src.main.BasicQuestions;

//To check if a string is palindrome string or not
//without using stringbuilder or stringbuffer methods
public class CheckIfPalindromeStr {
    static void main() {

        String str = "madam";

        char[] c = str.toCharArray();
        String rev="";
        for(int i=c.length-1;i>=0;i--){
            rev = rev + c[i];
        }
        if(str.equals(rev)){
            System.out.println(str+" is a palindrome string");
        }
        else{
            System.out.println(str+" is not a palindrome string");
        }
    }
}