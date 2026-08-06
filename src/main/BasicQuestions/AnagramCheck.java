package src.main.BasicQuestions;

import java.util.Arrays;

//program to check if two strings are anagrams
// Two string are anagram strings only if -
// the length of two strings is equal & the frequency of char count in both strings is equal
public class AnagramCheck {

    static void main() {

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not anagram strings");
        }
        else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagram Strings");
            }
            else{
                System.out.println("Not Anagram Strings");
            }
        }
    }
}
