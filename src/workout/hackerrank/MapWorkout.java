package workout.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapWorkout {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> phoneDictionary = new HashMap();
        List<String> query = new ArrayList();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneDictionary.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(null != phoneDictionary && phoneDictionary.containsKey(s)) {
                System.out.println("Answer"+s+"="+phoneDictionary.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        Iterator itr=phoneDictionary.entrySet().iterator();


        while(itr.hasNext()){

            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Map.Entry m:phoneDictionary.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        for(Map.Entry m:phoneDictionary.entrySet()){

        }
//        System.out.println("input"+phoneDictionary);
//        System.out.println("query"+query);
//        for(String question:query){
//            if(null != phoneDictionary) {
//                int value=phoneDictionary.get(question);
//                System.out.println("value"+value);
//                if(value!=0){
//                    System.out.println("Answer"+question+"="+value);
//                }else{
//                    System.out.println("Answer"+" Not found");
//
//                }
//            }
//
//        }





    }
}
