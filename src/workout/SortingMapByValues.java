package workout;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapByValues {
    public static void main(String[] args) {
        Map<String,Integer> inputMap=new HashMap<>();
        Map<String,Integer> outMap=new LinkedHashMap<>();

        inputMap.put("tamil",91);
        inputMap.put("english",95);
        inputMap.put("math",100);
        Map<String,Integer> outMap1=inputMap.entrySet().stream().
                sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1+e2,LinkedHashMap::new));
        System.out.println(outMap1);

        List<Integer> values = inputMap.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
      values.sort(Comparator.reverseOrder());
        for(Integer y:values){
            for(Map.Entry x:inputMap.entrySet()){
            if(x.getValue().equals(y)){
                outMap.put((String) x.getKey(),y);
            }
        }
      }
        System.out.println(outMap);

    }
}
