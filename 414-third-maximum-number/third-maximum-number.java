class Solution {
    public int thirdMax(int[] num) {
        Arrays.sort(num);
        int j = 0;
        // ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<num.length-1; i++){
            if (num[i]!= num[i+1]){
                nums.add(num[i]);
            }
        }
        nums.add(num[num.length-1]);
        System.out.println(num.length);
        System.out.println(nums.size());
        nums.toArray();
        if(nums.size()==1){
            return nums.get(0);
        }
        if(nums.size()==2){
            return Math.max(nums.get(0), nums.get(1));
        }
        for(int x: nums){
            System.out.println(x);
        }

        return nums.get(nums.size()-3);
    }
}