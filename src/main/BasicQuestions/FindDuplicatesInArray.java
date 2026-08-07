package src.main.BasicQuestions;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Find duplicates in array
public class FindDuplicatesInArray {
    static void main() {

        int[] nums = {10,20,30,40,10,30,50}; //duplicates are 10, 30

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
//        System.out.println(map);
        Set<Integer> s = new HashSet<>();
        for(Map.Entry<Integer,Integer> et: map.entrySet()){
            if(et.getValue() == 2){
                s.add(et.getKey());
            }
        }

        //print output
        System.out.println("The duplicate elements in the array is: ");
        for(Integer ele: s){
            System.out.println(ele);
        }
    }
}
