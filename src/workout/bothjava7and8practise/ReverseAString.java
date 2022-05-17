package workout.bothjava7and8practise;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.next();
        String reverse ="";
        //Approach1
        for(int i=input.length()-1;i>=0;i--){
            reverse = reverse+input.charAt(i);
        }
        //Approach 2
        char[] inputArr= input.toCharArray();
        for(int i=inputArr.length-1;i>=0;i--){
            reverse =reverse+inputArr[i];
        }

        //Approach3
        StringBuffer sb =new StringBuffer(input);
        reverse=sb.reverse().toString();
        System.out.println("reversed String "+reverse);

    }
}
