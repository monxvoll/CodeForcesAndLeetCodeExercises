package leetcode;

public class RemoveElement {
    //27. Remove Element
    class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            int iterator = 0;
            while (iterator<nums.length){
                if(nums[iterator]!=val){
                    nums[k]=nums[iterator];
                    k++;
                }
                iterator++;
            }
            return k;
        }
    }
}
