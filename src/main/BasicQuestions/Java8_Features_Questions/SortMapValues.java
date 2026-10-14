package src.main.BasicQuestions.Java8_Features_Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sort Map Values based on value not key - using java 8 features only
public class SortMapValues {
    static void main() {

        Map<String, Integer> map = new HashMap<>();
        map.put("A",20);
        map.put("C",10);
        map.put("F",14);
        map.put("M",30);
        map.put("H",25);
        map.put("B",40);

        // sorting map based on values - ASC order
        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        sortedMap.forEach((key,value)-> System.out.println(key+" - "+value));

        System.out.println("-------------------------");
        // sorting map based on keys - ASC order
        // just replace Map.Entry.comparingByValue() - Map.Entry.comparingByKey()
        LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        sorted.forEach((key,value)-> System.out.println(key+" - "+value));
    }
}
