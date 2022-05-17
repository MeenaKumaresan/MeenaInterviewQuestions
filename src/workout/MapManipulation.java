package workout;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapManipulation {
    public static void main(String[] args) {
        Map<String,Integer> inputMap = new HashMap<>();
        inputMap.put("Meena",28);
        inputMap.put("Sanjay",30);
        inputMap.forEach((k,v)-> System.out.println("Key"+k+"value"+v));
        for(Map.Entry entry:inputMap.entrySet()){

        }
        // inputMap.entrySet().stream().sorted()
        List<String> keyList = inputMap.entrySet().stream().map(x -> x.getKey()).collect(Collectors.toList());
        System.out.println(keyList);
        List<Integer> valueList=inputMap.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        System.out.println(valueList);
    }
}
