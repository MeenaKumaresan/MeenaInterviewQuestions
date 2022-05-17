package workout;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] input={10,40,20,50,60};
        int size = input.length;
        int max= input[0];
      //  System.out.println(max);
        int secondMax= input[0];
        for(int i=1;i<size;i++){
            if(input[i]>max){
                secondMax=max;
                max=input[i];
            }
            else if (input[i]>secondMax){
                secondMax=input[i];
            }
        }
        System.out.println(secondMax);
        int temp =0;
        for(int i=0;i<size;i++){ //10,40,20,60
            for(int j=i+1;j<size;j++){
                if(input[i]>input[j]){
                    temp= input[j]; //40
                    input[j]=input[i]; //20
                    input[i]=temp; //
                }
            }
        }
        secondMax=input[size-2];
       // System.out.println(secondMax);
        System.out.println(Arrays.toString(input));


    }
}
