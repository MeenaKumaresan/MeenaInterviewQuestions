package workout.program.april29.cbe;

import java.util.Arrays;
import java.util.List;

public class SortingIntegerArray {

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(inputArray));
        System.out.println(inputArray.toString());

        List inputList =Arrays.asList(inputArray);

        int temp =0;
    for(int i=0;i<inputArray.length;i++){
       for (int j=i+1;j<inputArray.length;j++){
           if(inputArray[i]>inputArray[j]){
               temp = inputArray[i];
               inputArray[i] =inputArray[j];
               inputArray[j] =temp;
           }
       }
    }
        for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }
}