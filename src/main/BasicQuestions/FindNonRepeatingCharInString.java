package src.main.BasicQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Find the First non-repeating character in string
// HashMap technique
public class FindNonRepeatingCharInString {

    static void main() {
        String name = "swiss";

        HashMap<Character,Integer> map = new LinkedHashMap<>();
        //changed to Linked HM - as it maintains insertion order & we want to fetch the first character

        char[] arr = name.toCharArray();
        for(Character c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> et:map.entrySet()){
            if(et.getValue() == 1){
                System.out.println("The first non repeating character in the string is: "+et.getKey());
                break;
            }
        }
    }
}
