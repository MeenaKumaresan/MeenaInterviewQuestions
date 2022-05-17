package workout.program.april28Utimatric;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String input="I am Meena";
        List<String> inputList = Arrays.asList(input.split(" "));
        System.out.println(inputList);
        int inSize = inputList.size();
        System.out.println(inSize);

        String finalOut=null;
        String rev1=null;

        for(int i=inSize-1;i>=0;i--){
            String rev=inputList.get(i);
            System.out.println(inputList.get(i));
           for(int j=rev.length()-1;j>=0;j--){
                rev1= rev1+String.valueOf(rev.charAt(j));
          }
            System.out.println(rev1);

            finalOut = " "+rev1 +" ";
        }
        System.out.println("rev "+finalOut);
    }
}
