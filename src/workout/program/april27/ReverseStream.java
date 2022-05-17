package workout.program.april27;

import java.util.Arrays;

public class ReverseStream {
    public static void main(String[] args) {
        String input = "madam";
        String output = "";

        char[] inputArr = input.toCharArray();
        System.out.println(inputArr);

        int size = input.length();
        System.out.println(size);
        System.out.println(inputArr);

        for (int i = size-1; i >= 0; i--) {
            output = output + inputArr[i];
        }
        System.out.println(output);

        if (input .equals(output) ) {
            System.out.println("its  a palindrome");
        } else {
            System.out.println("its  not a palindrome");
        }

    }

    public static class SortingElements {
        public static void main(String[] args) {
            //9,5,4,6,2,1
            int[] inputArray = {9,5,4,6,2,1};
            int temp =0;
            for(int i=0;i<inputArray.length;i++){
                for(int j=i+1;j<inputArray.length;j++){
                    if(inputArray[i]>inputArray[j]){
                        temp = inputArray[i];
                        inputArray[i] = inputArray[j];
                        inputArray[j] = temp;
                    }
                }
            }

            for(int i=0;i<inputArray.length;i++){
                System.out.println(""+inputArray[i]);
            }
            System.out.println(Arrays.toString(inputArray));

        }
    }
}
