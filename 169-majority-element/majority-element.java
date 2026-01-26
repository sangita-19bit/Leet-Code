class Solution {
        public int majorityElement(int[] nums) {
        int count = 0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if (count==0){
                count=1;
                element=nums[i];
            }else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //         if(count > nums.length/2){
        //             return nums[i];
        //         }
        //     }
        //     return -1;
        }
    }


