package leetcode;
public class DistributeElementsIntoTwoArrays {
//3069. Distribute Elements Into Two Arrays I
    class Solution {
        public int[] resultArray(int[] nums) {

            int[] arr1 = new int[nums.length];
            int[] arr2 = new int[nums.length];

            int iterator = 0,kiterator=0;

            arr1[iterator++] = nums[0];
            arr2[kiterator++] = nums[1];

            for (int i = 2; i < nums.length; i++) {
                if (arr1[iterator - 1] > arr2[kiterator - 1]) {
                    arr1[iterator++] = nums[i];
                } else {
                    arr2[kiterator++] = nums[i];
                }
            }
            int[] result = new int[iterator + kiterator];
            System.arraycopy(arr1, 0, result, 0, iterator);
            System.arraycopy(arr2, 0, result, iterator, kiterator);

            return result;
        }
    }
}
