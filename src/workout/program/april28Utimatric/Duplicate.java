package workout.program.april28Utimatric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("m","e","e","n","a");
        List<String> outputList=new ArrayList<>();
        for(String s:inputList){
            if(!outputList.contains(s)){
                outputList.add(s);
            }

        }
        System.out.println("output List"+outputList);
        String in ="meena";
       // String[] strAr = in.split("");
        //inputList =Arrays.asList(strAr);
        Map<Character,Integer> outMap = new HashMap<>();
        for(int i=0;i<in.length();i++){
            if(outMap.containsKey(in.charAt(i))){
                outMap.put(in.charAt(i), outMap.get(in.charAt(i))+1);
            }else{
                outMap.put(in.charAt(i),1);
            }

        }
//        System.out.println("output Map"+outMap);
        System.out.println("output Map"+outMap);

    }
}
