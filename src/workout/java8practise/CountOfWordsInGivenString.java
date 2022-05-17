package workout.java8practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWordsInGivenString {
    public static  void main(String args[]){
        String str ="Welcome to java code and java code welcome you";
//        List<String> inputList = Arrays.asList(str.split(" "));
        List<String> inputList = new ArrayList<>(Arrays.asList(str.split(" ")));
        inputList.add("sanjay");
        Map<String,Long> output=inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(output);
    }
}
