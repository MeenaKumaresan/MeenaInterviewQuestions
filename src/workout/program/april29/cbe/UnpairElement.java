package workout.program.april29.cbe;

import java.util.HashMap;
import java.util.Map;

public class UnpairElement {
    public static void main(String[] args) {
//        Problem : given an array A consisting of N integers ,
//        returns the value of the unpaired element.
//        sample:
//        9,3,9,3,9,7,9 ==>7
//        9,7,3,9,7,3,7 ==> 7
//        1,2,3,4,1,2,3 ==> 4
//        Rules:
//        Array will always contains Odd number of Elements.
//        And There is Only one element which is unpaired

        int[] inputArray = {1,2,3,4,1,2,3};
        Map<Integer,Integer> outputMap=new HashMap<>();
        for(int i=0;i<inputArray.length;i++){
            if(!outputMap.containsKey(inputArray[i])){
                outputMap.put(inputArray[i],1);
            }else{
                outputMap.put(inputArray[i],outputMap.get(inputArray[i])+1);
            }
        }
        System.out.println(outputMap);

    }
}
