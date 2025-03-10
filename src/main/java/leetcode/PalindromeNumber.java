package leetcode;
public class PalindromeNumber {
       class Solution {
        public boolean isPalindrome(int x) {
            String num = String.valueOf(x);
            int aux = num.length()-1;
            for (int i = 0; i < num.length()/2; i++) {
                if(num.charAt(i) != num.charAt(aux)){
                    return false;
                }
                aux--;
            }
            return true;
        }
    }
}
