package workout.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] input = { 2, 3, 5, 6, 7, 9};
       //Arrays.stream(input).map()
        List<Integer> missingVar = new ArrayList<>();
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        List<Integer> list=Arrays.asList( 2, 3, 5, 6, 7, 9);
        int startingRange=1;
        int endRange=10;
        int size =input.length;
        for(int i=startingRange;i<=endRange;i++){
            if(!list.contains(i)){
                System.out.println(i);
                 missingVar.add(i);
            }
        }
//        if(input[0]!=startingRange){
//            missingVar.add(startingRange);
//        }
//        if(input[size-1]!=endRange){
//            missingVar.add(endRange);
//        }



//        for (int i = 0; i < input.length; i++) {
//        }

//        for (int i = 0; i < input.length; i++) {
//            if(i!=input.length) {
//                if (input[i] - input[i + 1] == 1) {
//
//                } else {
//                    missingVar.add(input[i] + 1);
//                }
//            }
//        }
        System.out.println(missingVar);
    }
}