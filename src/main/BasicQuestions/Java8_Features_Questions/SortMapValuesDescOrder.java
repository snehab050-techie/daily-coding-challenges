package src.main.BasicQuestions.Java8_Features_Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class SortMapValuesDescOrder {
    static void main() {

        //Sort the map entries based on values - in desc order

        Map<String, Integer> map = new HashMap<>();
        map.put("F",45);
        map.put("A",20);
        map.put("C",10);
        map.put("M",30);
        map.put("H",25);
        map.put("B",40);

       LinkedHashMap<String,Integer> sortedMap =  map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));

        sortedMap.forEach((key, value) -> System.out.println(key+" - "+value));
    }
}
