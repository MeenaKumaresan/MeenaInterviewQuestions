package workout.hackerrank;
import java.util.*;

public class SetWorkout {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> nameSet=new TreeSet();
        List<String> nameList=new ArrayList();
        List<String> checkList=new ArrayList();
        for(int i=0;i<pair_left.length;i++) {
            nameSet.add(pair_left[i]+ " " +pair_right[i]);
            nameList.add(pair_left[i]+ " " +pair_right[i]);
        }
        System.out.println("nameSet"+nameSet);
        System.out.println("nameList"+nameList);

        for(String value : nameList) {
            if(checkList.contains(value)) {
            }else{
                checkList.add(value);
            }

            System.out.println(checkList.size());
        }

    }
}
