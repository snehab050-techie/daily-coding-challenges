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

        //Alternative solutions
        String sentence = "Hey I enjoy java enjoy I";

        String[] arr = sentence.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String str: arr){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("-----Using Streams API-----");
        Map<String, Long> resMap = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>=2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(resMap);
    }
}
