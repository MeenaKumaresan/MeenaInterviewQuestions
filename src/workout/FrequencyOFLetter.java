package workout;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOFLetter {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("Alliswell".split(""));
        System.out.println(input);
        Map<String, Long> collect = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
        System.out.println(collect);
        Boolean flag= false;
        String dup="";
        List<String> output=new LinkedList<>();
    for(String s:input){
        if(!output.contains(s)){
            output.add(s);
        }else{
            flag= true;
            dup=s;
            break;
        }
    }
        System.out.println(dup);
    }
}
