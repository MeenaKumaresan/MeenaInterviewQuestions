package workout.test;

import java.util.Scanner;

public class Fibonacci {
    //fib= a+b,a=b,b=fib
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int number = scan.nextInt();
        int firstInput=0;
        int secondInput =0;
        int output=0;
        int value = 1;

        System.out.println("1st input");
        firstInput = scan.nextInt();
        System.out.println("2nd input");
        secondInput = scan.nextInt();

        System.out.println("Fibonaaci series");
        if(number == 1 ) {
            System.out.println(firstInput);
            return;
        }
        if(number > 1) {
            System.out.println(firstInput);
            System.out.println(secondInput);

        }
        for(int i=3; i<=number;i++){
        output = firstInput+ secondInput;
        firstInput = secondInput;
        secondInput= output;
        System.out.println(output);
        }

    }

}
