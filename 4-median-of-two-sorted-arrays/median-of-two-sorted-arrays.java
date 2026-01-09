class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a =nums1.length;
        int b =nums2.length;
        int arr[] = new int [a+b];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a && j<b){
        if(nums1[i]<nums2[j]){
        arr[k]=nums1[i];
        i++;
        k++;
        }else{
        arr[k]=nums2[j];  
        j++;
        k++;
}
}
while(i<a){
arr[k]=nums1[i];
i++;
k++;
}
while(j<b){
arr[k]=nums2[j];
j++;
k++;
}
for(int x=0; x<arr.length; x++){
System.out.print(arr[x]);
}
int z = arr.length;
if(z%2 == 0){
int el1 = arr[z/2];
int el2 = arr[z/2-1];
double ans = (el1+el2)/2.00;
return ans;
}else{
return arr[z/2];
}
}
}
