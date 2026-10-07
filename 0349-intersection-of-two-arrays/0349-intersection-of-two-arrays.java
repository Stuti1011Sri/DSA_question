class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int l =nums1.length;
       int n = nums2.length;
       HashSet<Integer> set = new HashSet<>();
       
       for(int i : nums1){
            set.add(i);
        
       }
       HashSet<Integer> answer = new HashSet<>();
       for(int i: nums2){
        if(set.contains(i)){
            answer.add(i);
        }
       }
       int [] result = new int[answer.size()];
       int j= 0;
       for(int i : answer){
        result[j++] = i;
       }
       return result;
    }
}