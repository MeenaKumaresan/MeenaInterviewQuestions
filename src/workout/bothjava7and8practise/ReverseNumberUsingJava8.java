package workout.bothjava7and8practise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseNumberUsingJava8 {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String[] input = String.valueOf(num).split("");
        List<String> inputList = Arrays.asList(input);

//        System.out.println("Output:"+inputList);
//        String reversenumber = inputList.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());
//        System.out.println("reversenumber"+reversenumber);

        String reveresed = String.valueOf(num)
                .chars()
                .mapToObj(Character::getNumericValue)
                .reduce( "",(l, r) -> r+l,(l, r) -> l+r);
        System.out.println(reveresed); // 01010101

    }

}
