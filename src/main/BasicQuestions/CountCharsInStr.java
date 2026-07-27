package src.main.BasicQuestions;

public class CountCharsInStr {

    static void main() {

        //Program to find frequency of a char in a String
        String str = "aooomon";
        char findCountForChar = 'a';
        int count = 0;

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == findCountForChar){
                count++;
            }
        }
        System.out.println("Frequency of char:"+findCountForChar+" in : "+str+" is : "+count);

        //Program to find frequency of all characters in a String
        System.out.println("---------------");
        String name = "Java";
        char[] charArr = name.toCharArray(); //Alternative - str.charAt(index) instead if converting to array of chars

        for(int i=0;i<charArr.length;i++){
            int charCount = 0;
            for(int j=0;j<charArr.length;j++){
                if(charArr[i] == charArr[j]){
                    charCount++;
                }
            }
            System.out.println("Frequency of char: " + charArr[i] + " is : " + charCount);
        }

        //Program to find the one time occurring character in a String
        System.out.println("--------------");
        String prodcut = "through";

        for(int i=0;i<prodcut.length();i++){
            int oneC = 0;
            for(int j=0;j<prodcut.length();j++){
                if(prodcut.charAt(i) == prodcut.charAt(j)){
                    oneC++;
                }
            }
            if(oneC == 1){
                System.out.println("One time occring char in string: "+prodcut+" is: "+prodcut.charAt(i));
            }
        }
    }
}
