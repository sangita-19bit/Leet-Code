import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] nums) {
       for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
       }
      Arrays.sort(nums);
      
       return nums;
    }
}