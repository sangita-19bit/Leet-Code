class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur=0;
        int largest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
                largest=Math.max(largest,cur);
            }else{
                cur=0;
            }

        }
        return largest;
    }
}