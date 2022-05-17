package workout;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
        String input = "good morning";
        LongestSubStringWithoutRepeating obj = new LongestSubStringWithoutRepeating();
        obj.getLongestSubstring(input);
    }

    public void getLongestSubstring(String value) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        int longestLength =0;
        String longestString = null;
        for(int i=0; i<value.length();i++) {
            char characterValue = value.charAt(i);
            if(!map.containsKey(characterValue)) {
                map.put(characterValue,i);
            } else {
                i = map.get(characterValue);
                map.clear();
            }
            if(map.size()>longestLength) {
                longestLength = map.size();
                longestString = map.keySet().stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining());

            }
        }

        System.out.println(longestLength);
        System.out.println(longestString);
    }
}
