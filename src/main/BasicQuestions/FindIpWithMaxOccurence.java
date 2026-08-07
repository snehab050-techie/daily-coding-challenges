package src.main.BasicQuestions;

// Find IP address with maximum occurrences from logs

import java.util.HashMap;
import java.util.Map;

public class FindIpWithMaxOccurence {
    static void main() {

        String[] ips = {
                "196.101.0.1",
                "10.0.1.1",
                "196.101.0.1",
                "10.0.1.1",
                "196.101.0.1",
                "174.901.1.4"
        };

        HashMap<String, Integer> map = new HashMap<>();  //initially empty - {}
        for(String ip: ips){
            map.put(ip, map.getOrDefault(ip,0)+1);
        }

//        System.out.println(map);
        int maxCount = 0;
        String maxIp = "";
        for(Map.Entry<String,Integer> et: map.entrySet()){
            if(et.getValue() > maxCount){
                maxCount = et.getValue();
                maxIp = et.getKey();
            }
        }
        System.out.println("The highest occuring IP in the logs is: "+maxIp+" with count: "+maxCount);
   }
}
