package workout.java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String args[]){
        List<Integer> inputList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        inputList.stream().limit(5).forEach(x-> System.out.println(x));
        inputList.stream().limit(5).collect(Collectors.toList());

    }
}
