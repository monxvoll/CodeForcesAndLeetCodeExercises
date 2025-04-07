package leetcode;

public class LengthOfLastWord {
   //58. Length of Last Word
    class Solution {
        public int lengthOfLastWord(String s) {
            if(!s.contains(" ")) {
                return s.length();
            }
            int length = 0;
            for (int i = s.length()-1; i >= 0 ; i--) {
                if(s.charAt(i)!=' '){
                    length++;
                } else if (s.charAt(i)==' '&&length >0) {
                    break;
                }
            }
            return length;
        }
    }
}
