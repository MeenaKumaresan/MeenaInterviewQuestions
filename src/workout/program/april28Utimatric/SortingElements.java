package workout.program.april28Utimatric;

public class SortingElements {
    public static void main(String[] args) {
      // List<Integer> inputList= Arrays.asList(10,2,3,5,7,9);
      //  Collections.sort(inputList);
       String input = "Meena" ;
       String rev="";
       for(int i=input.length()-1;i>=0;i--){
           rev= rev+input.charAt(i);
       }
        System.out.println(rev);
    }
}
