package leetcode;

import java.util.Stack;

public class ValidParentheses {
    
     class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(Character c : s.toCharArray()){
                if(c=='('||c=='['||c=='{'){
                    stack.push(c);
                }else {
                    if(stack.isEmpty()){
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
