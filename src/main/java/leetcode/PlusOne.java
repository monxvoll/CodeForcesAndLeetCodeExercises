package leetcode;

public class PlusOne {
//66. Plus One
    class Solution {
        public static int[] plusOne(int[] digits) {
            int i = digits.length-1;
            int num = digits[digits.length-1];

               while (num == 9){
                   if(i==0){
                      int[] array = new int[digits.length+1];
                      for (int a : array){
                          a = 0;
                      }
                      array[0]=1;
                      return array;
                   }
                   digits[i]=0;
                   i--;
                   num = digits[i];
               }

            digits[i] = digits[i]+1;
           return digits;
        }
    }
}
