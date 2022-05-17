package workout.java8practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class finingDuplicateOn3Arrays {
    public static  void main(String args[]) {
        List<Integer> inputList1 = Arrays.asList(10, 20, 40, 40, 50);
        List<Integer> inputList2 = Arrays.asList(40, 80, 40, 60, 50);
        List<Integer> inputList3 = Arrays.asList(40, 100, 40, 160, 50);
        Set<Integer> convert = new HashSet<>(inputList1);

        Set<Integer> output1 = inputList1.stream().filter(x -> Collections.frequency(inputList1, x) > 1).collect(Collectors.toSet());
       // System.out.println(output1);

        Map<Integer, Long> output = inputList2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Integer> output2 = output.entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toSet()).stream().map(x -> x.getKey()).collect(Collectors.toSet());
       // System.out.println(output2);

        Set<Integer> output3 = inputList3.stream().filter(x -> Collections.frequency(inputList1, x) > 1).collect(Collectors.toSet());
     //   System.out.println(output3);
        Set<Integer> final1 = new HashSet<>();
        Set<Integer> final2 = new HashSet<>();
        for(Integer i:output1){
            if(output2.contains(i)){
                if(output3.contains(i)){
                    final1.add(i);
                }
            }
        }
        System.out.println("common duplicated in 3 arrays"+final1);
        for(Integer i:inputList1){
            if(inputList2.contains(i)){
                if(inputList3.contains(i)){
                    final2.add(i);
                }
            }
        }
        System.out.println("common  in 3 arrays"+final2);


    }
}
