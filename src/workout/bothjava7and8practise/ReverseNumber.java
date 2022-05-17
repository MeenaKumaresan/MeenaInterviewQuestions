package workout.bothjava7and8practise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        ////approach 1 without default functions
        int rev=0;
        int finalReversenumber=0;
//        while(num!=0){
//            rev = rev*10+num%10;
//            num =num/10;
//        }
//        System.out.println("reversed number"+rev);

        ////approach2

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        System.out.println("reversed number"+sb.reverse());

        ////approach3

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        //sb.reverse();
               System.out.println("reversed number"+sb.reverse());

    }

}
