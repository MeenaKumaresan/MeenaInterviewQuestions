package workout.test;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input to check prime or not");
        int input = scan.nextInt();
        int div = input/2;
        Boolean flag = true;
        if(input==0 || input ==1){
          flag = false;
        }
        for(int i=2;i<div;i++){
          if(input%i==0)  {
              flag = false;
              break;
          } else {
              flag = true;
          }
        }
        if(flag==true){
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }

}
