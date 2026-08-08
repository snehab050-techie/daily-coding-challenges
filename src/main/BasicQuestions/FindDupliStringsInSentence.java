package src.main.BasicQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Program to find duplicate words in a sentence
public class FindDupliStringsInSentence {
    static void main() {
        String sentence = "I went home again I went home";

        String[] arr = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(String str: arr){
            map.put(str, map.getOrDefault(str,0)+1);
        }

//        System.out.println(map);
        Set<String> res = new HashSet<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getKey().length() > 1) { // to remove duplicate chars
                if (entry.getValue() == 2) {
                    res.add(entry.getKey());
                }
            }
        }
        System.out.println("Duplicate strings are: "+res);
    }
}
