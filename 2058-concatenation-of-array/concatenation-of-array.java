class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans [] = new int [2*n];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;    

       
    }
    
}