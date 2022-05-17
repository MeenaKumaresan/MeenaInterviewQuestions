package workout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfPair {
    //0,1,2,3,4,5 sum =5
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5);
        Map<Integer,List<Integer>> map=new HashMap<>();
        int count=0;
        int sum =5;
        int size=list.size();
        System.out.println(list.size());
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(list.get(i)+list.get(j)==sum){
                    count++;
                    List<Integer> pairList=new ArrayList<>();
                    pairList.add(list.get(i));
                    pairList.add(list.get(j));
                    System.out.println(pairList);
                    System.out.println(count);
                    map.put(count,pairList);
                }

            }
        }
        System.out.println(map);
    }
}
