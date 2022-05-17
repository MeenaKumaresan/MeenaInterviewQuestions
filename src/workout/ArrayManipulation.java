package workout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayManipulation {
    public static void main(String[] args) {
                //4,2,4,3,1,2,1,3,2,1,4
                //4,4,4,2,2,2,3,3,1,1,1
       List<Integer> integerList = Arrays.asList(4,2,4,3,1,2,1,3,2,1,4);
        int[] inputArr = {4,2,4,3,1,2,1,3,2,1,4};
//        int temp;
//        Map<Integer,Integer> map = new LinkedHashMap<>();

        Map<Integer, Long> map = Arrays.stream(inputArr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

//        for(Integer value: integerList){
//            if(map.containsKey(value)) {
//                map.put(value,map.get(value) + 1);
//            } else {
//                map.put(value,1);
//            }
//        }
        int[] outputArray = new int[integerList.size()];
        int i =0;
        for(Map.Entry<Integer,Long> entry: map.entrySet()) {
            int value = Math.toIntExact(entry.getValue());
            Arrays.fill(outputArray,i, value + i,entry.getKey());
            i = value + i;
        }
        System.out.println(Arrays.toString(outputArray));
//        map.forEach((k,v) -> {

//        });

//        System.out.println(Arrays.toString(outputArray));
//        for(int i=0;i<inputArr.length;i++){
//            Integer value = inputArr[i];
//            if(map.containsKey(value)){
//                map.put(value,map.get(value)+1);
//            }else{
//                map.put(value,1);
//            }
//        }

//        System.out.println(map);


//        for(int i=0;i<inputArr.length;i++){
//            for(int j=i;j<inputArr.length;j++){
//                if(inputArr[i]==inputArr[j]){
//                    temp = inputArr[j];
//                    inputArr[j]=temp;
////                    temp = inputArr[i];
////                    inputArr[j]=inputArr[j];
////                    inputArr[i] =temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(inputArr));

    }
}
