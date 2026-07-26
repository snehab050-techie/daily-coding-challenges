package src.main.BasicQuestions;

//Reverse a string without using StringBuffer or StringBuilder classes
public class ReverseAString {
    static void main() {
        String str = "apple";
        String rev = "";

        char[] arr = str.toCharArray();

        for(int i=arr.length-1;i>=0;i--){
            rev = rev + arr[i];
        }

        System.out.println("Orginal String: "+str);
        System.out.println("Reversed string: "+rev);
    }
}
