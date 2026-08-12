class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n= nums1.length;
     int m= nums2.length;
     int c = m+n;
     int [] arr = new int[c];
     int i=0, j=0, k=0;
     while(i<n && j<m){
        if(nums1[i] <= nums2[j]){
            arr[k++] = nums1[i++];
        }
        else{
           arr[k++] = nums2[j++]; 
        }
     }
     while(i<n){
        arr[k++] = nums1[i++];
     }
     while(j<m){
        arr[k++] = nums2[j++];
     }
     if(c%2 == 0){
        double median = (arr[c/2 -1]+ arr[c/2])/2.0;
        return median;
     }
     else{
       
        return arr[c/2];
     }
     
    }
}