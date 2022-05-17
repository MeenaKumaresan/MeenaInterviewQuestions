package workout.bothjava7and8practise;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckStringPalindromeByJava8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
       // int num=123;
        Boolean flag;
        flag = IntStream.range(0, input.length()).noneMatch(i -> input.charAt(i) != input.charAt(input.length() - 1 - i));

        if (flag == true) {
            System.out.println("Given  String is palindrome");
        } else {
            System.out.println("Given  String is not palindrome");

        }

       String rev=Arrays.asList(input).stream().map(str->new StringBuilder(str).reverse().toString()).collect(Collectors.toList()).get(0);
        if (rev.equals(input)) {
            System.out.println("Given  String is palindrome");
        } else {
            System.out.println("Given  String is not palindrome");

        }

//        System.out.println("output "+rev);
    }
}