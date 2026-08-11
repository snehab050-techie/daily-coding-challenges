package src.main.BasicQuestions;

import java.util.*;

// Sort string based on character frequency - asc & desc
public class SortStringOnCharFreq {
    static void main() {

        String str = "tree";
        System.out.println("Before sorting: "+str);

        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : arr){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        List<Character> list =new ArrayList<>(map.keySet());

        //Sorted based on desc order
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        System.out.println("After sorting string based on char frequency desc order:");
        for(char ch:list) {
            for(int i=0;i<map.get(ch);i++){
                System.out.print(ch);
            }
        }

        //Sorted based on asc order
        Collections.sort(list, (a,b) -> map.get(a) - map.get(b));
        System.out.println();
        System.out.println("After sorting string based on char frequency asc order:");
        for(char ch:list) {
            for(int i=0;i<map.get(ch);i++){
                System.out.print(ch);
            }
        }
    }
}
