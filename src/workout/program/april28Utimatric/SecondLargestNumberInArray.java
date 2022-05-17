package workout.program.april28Utimatric;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] inputarr ={5,30,15,25,3,2};
        int[] output ;
        int max=inputarr[0];
        int secondMax=inputarr[0];
       // System.out.println("length" +inputarr.length);
        for(int i=0;i<inputarr.length;i++){
           if(inputarr[i]>max){
               secondMax = max;
               max =inputarr[i];
           } else if(inputarr[i]>secondMax) {
               secondMax = inputarr[i];
           }
        }

        System.out.println("Maximum element"+max);
        System.out.println("Maximum element"+secondMax);
    }
}
//5,30,15,25,3,2


