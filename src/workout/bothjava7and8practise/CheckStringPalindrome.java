package workout.bothjava7and8practise;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        Boolean flag;
        // flag =checkPalindromeByStringBuilder(input);
         flag =checkPalindromeByForLoop(input);
        if(flag==true){
            System.out.println("Given  String is palindrome");
        }else {
            System.out.println("Given  String is not palindrome");
        }

    }

    private static Boolean checkPalindromeByStringBuilder(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

    private static Boolean checkPalindromeByForLoop(String input){
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)){
                return false;
            }

        }
        return true;
    }
}
