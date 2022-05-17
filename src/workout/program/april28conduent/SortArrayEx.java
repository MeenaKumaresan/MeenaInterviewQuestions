package workout.program.april28conduent;

public class SortArrayEx {
    public static void main(String[] args) {
        int[] inputArray = {5,4,10,2,6};
        int temp;
        for(int i=0;i<inputArray.length;i++){
            for (int j=i+1;j<inputArray.length;j++){
                if(inputArray[i]>inputArray[j]){
                    temp=inputArray[i];
                    inputArray[i]=inputArray[j];
                    inputArray[j]=temp;
                }
            }

        }
        System.out.println("output"+inputArray[inputArray.length-2]);
    }
}
