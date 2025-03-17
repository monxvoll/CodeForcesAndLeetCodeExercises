package leetcode;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //1. Two Sum
    class Solution {
        public  int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                //a + b = target, entonces b = target - a.
                int complemento = target - nums[i];

                if (map.containsKey(complemento)) {
                    return new int[]{map.get(complemento), i};
                }

                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
}
