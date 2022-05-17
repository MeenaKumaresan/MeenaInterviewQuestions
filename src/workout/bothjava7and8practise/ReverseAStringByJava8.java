package workout.bothjava7and8practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAStringByJava8 {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the String");
        String input="Hi Meena ji";
        ////1
//        String rev=Arrays.asList(input).stream().map(str->new StringBuilder(str).reverse().toString()).collect(Collectors.toList()).get(0);
//        System.out.println("output "+rev);

////2
        String[] strArr= input.split("");
        List<String> inputList= Arrays.asList(strArr);
        String reverse=inputList.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining(" "));
        System.out.println("output "+reverse);



    }
}
