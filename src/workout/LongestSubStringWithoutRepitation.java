package workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepitation {
    public static void main(String[] args) {
        String input = "good morning";
        //good morning
        // morni
        Set<String> setout = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
           for (int j = i; j < input.length(); j++) {

                // if (!String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(j)))) {
                if (!String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(j)))) {
                    String sub = input.substring(i, j);
                    setout.stream().distinct().forEach(System.out::println);

                    setout.add(sub);
                }
            }
            }
           // System.out.println(setout);
//            Map<String, Integer> map = new HashMap<>();
//            for (String s : setout) {
//                map.put(s, s.length());
//            }
           // System.out.println(map);

        setout.stream().distinct().forEach(System.out::println);
        }
    }

