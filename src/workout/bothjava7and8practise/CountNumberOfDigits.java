package workout.bothjava7and8practise;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int input =num;
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        System.out.println("CountNumberOfDigits : "+count);

        System.out.println("CountNumberOfDigitsbyString : "+String.valueOf(input).length());
    }

}
