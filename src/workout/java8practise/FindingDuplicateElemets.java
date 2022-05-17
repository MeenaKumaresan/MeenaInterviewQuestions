package workout.java8practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingDuplicateElemets {
    public static void main(String args[]) {
        List<Integer> inputList = Arrays.asList(10, 10, 20, 30, 40, 40, 40);
        Set<Integer> manipulationSet = new HashSet<>();
       // inputList.stream().filter(x -> manipulationSet.add(x)).forEach(x -> System.out.println(x));
       // inputList.stream().filter(x -> !manipulationSet.add(x)).forEach(x -> System.out.println(x));
        //Approach 1
      inputList.stream().filter(x->!manipulationSet.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));

        //Approach 2
       Map<Integer,Long> outputMap =inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Set<Integer> outputSet =outputMap.entrySet().stream().filter(x-> x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
        System.out.println("outputSet" + outputSet);

inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toSet());
        //Approach 3

        Set<Integer> output = inputList.stream().filter(x-> Collections.frequency(inputList,x)>1).collect(Collectors.toSet());
        System.out.println("output" + output);
    }
}
