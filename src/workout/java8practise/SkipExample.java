package workout.java8practise;

import java.util.Arrays;
import java.util.List;

public class SkipExample {
    public static void main(String args[]){
        List<Integer> inputList = Arrays.asList(1,2,2,4,5,6,7,8,9,10);
        inputList.stream().skip(2).forEach(x-> System.out.println(x));
    }
}
