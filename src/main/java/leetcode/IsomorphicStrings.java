package leetcode;

import java.util.*;

public class IsomorphicStrings {
    //205. Isomorphic Strings
     class Solution {
        public  boolean isIsomorphic(String s, String t) {
            Map<Character, Character> map = new HashMap<>();
            Set<Character> usedValues = new HashSet<>();
            for (int i = 0; i <s.length() ; i++) {
                if(map.containsKey(s.charAt(i))){
                    if(map.get(s.charAt(i))!=t.charAt(i)){
                        return false;
                    }
                }else {
                    if(!usedValues.add(t.charAt(i))){
                        return false;
                    }
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
            return true;
        }
    }
}
