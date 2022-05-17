package workout.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Jaba8Example {
    public static void main(String[] args) {
        List<Integer> inputList= Arrays.asList(160,172);

        Double avg=inputList.stream().filter(x->(x%2==0))
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
        int numbers[] = {2, 3, 1, 5, 4};
        OptionalDouble average = Arrays.stream(numbers).average();
        System.out.println(average.getAsDouble());
        
    }
}
