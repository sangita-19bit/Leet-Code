class Solution {
    public int search(int[] nums, int target) {
        int mid,low,high;
        low=0;
        high=nums.length-1;
        mid=((high+low)/2);
        while(low<=high){
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                high= mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
            mid=((high+low)/2);
                
        }
        return -1;
    }
}