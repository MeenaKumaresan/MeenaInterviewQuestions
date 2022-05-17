package workout;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseAstream {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Java Interview Started Java".split(" "));
        String str ="Java Interview Started";
        String[] inputArr;
        String input=null;
        String out=null;
        System.out.println(inputList);
        Set<String> unique=new HashSet<>(inputList);
        System.out.println(unique);
        for(String s: unique){
            System.out.println(s+(Collections.frequency(inputList,s)));
        }
        String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        String result1=Arrays.asList(str.split(" ")).stream().map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(result1);
    }
}
