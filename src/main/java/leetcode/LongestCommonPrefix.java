package leetcode;

public class LongestCommonPrefix {
    //14. Longest Common Prefix

     class Solution {
        public  String longestCommonPrefix(String[] strs) {

            String first = strs[0];

            for (int i = 0; i < first.length() ; i++) {
                char k = first.charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if(i >= strs[j].length()||strs[j].charAt(i)!=k){
                        System.out.println(first.substring(0,i));
                       return first.substring(0,i);
                    }
                }
            }
            return first;
        }
    }
}
