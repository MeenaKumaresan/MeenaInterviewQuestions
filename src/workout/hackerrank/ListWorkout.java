package workout.hackerrank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListWorkout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfInputs = scan.nextInt();
        int inputs ;
        List<Integer> listOfInput = new LinkedList();
        for (int i=0;i<numberOfInputs;i++){
            listOfInput.add(scan.nextInt());
        }

        int numberOfQuery = scan.nextInt();
        scan.nextLine();
        String operation=null;

        for(int i=0;i<numberOfQuery;i++){
            operation=scan.nextLine();
            if(operation.equals("")) {
                operation=scan.nextLine();
            }
            switch (operation) {
                case "Insert": ;
                    listOfInput.add(scan.nextInt(),scan.nextInt()) ;
                    break;
                case "Delete":
                    listOfInput.remove(scan.nextInt());
                    break;
                default:
                    break;
            }

//            if("Insert".equals(operation)){
//                int queryIndex = scan.nextInt();
//                int indexValue = scan.nextInt();
//                listOfInput.add(queryIndex,indexValue) ;
//            }
//
//            if("Delete".equals(operation)){
//                int queryIndex = scan.nextInt();
//                listOfInput.remove(queryIndex);
//            }
        }
//        StringBuilder builder = new StringBuilder();
//        for(Integer value : listOfInput) {
//            builder.append(value).append(" ");
//        }
        String value = listOfInput.stream().map(val -> String.valueOf(val)).collect(Collectors.joining(" "));
        System.out.println(value);
//        System.out.println(builder.toString().trim());
    }
}
