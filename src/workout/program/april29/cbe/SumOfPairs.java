package workout.program.april29.cbe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfPairs {
    public static void main(String[] args) {
//        [1,2,3,4,5]
//        Sum = 5
//        Pairs [2,3] & [1,4]
//        No of pairs 2
        int[] inputArray = {1, 2, 3, 4, 5};
        int sum = 5;
        int count=0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j<inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == sum) {
                    List<Integer> outputList = new ArrayList<>();
                    outputList.add(inputArray[i]);
                    outputList.add(inputArray[j]);
                    count++;
                    map.put(count,outputList);
                }
            }
        }

        System.out.println("pairs" + map);

    }
}
