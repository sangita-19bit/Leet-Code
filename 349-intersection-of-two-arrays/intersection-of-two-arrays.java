class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n1; i++){
            int cur = nums1[i];
            if(!map.containsKey(cur)){
                map.put(cur, 1);
            }
        }
        for(int i=0; i<n2; i++){
            int curr = nums2[i];
            if(map.containsKey(curr)){
                if(map.get(curr) == 1){
                    arr.add(curr);
                    map.put(curr, 0);
                }
            }
        }
        int []ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        } 
        return ans;
        
    }
}