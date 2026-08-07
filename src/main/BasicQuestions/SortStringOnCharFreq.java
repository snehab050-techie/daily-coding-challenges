package src.main.BasicQuestions;

import java.util.HashMap;
import java.util.Map;

// Sort string based on character frequency
public class SortStringOnCharFreq {
    static void main() {
        String str = "madam";

        char[] arr = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c:arr){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        //System.out.println(map);
    }
}
