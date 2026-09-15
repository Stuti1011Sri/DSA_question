class Solution {
    public int removeDuplicates(int[] nums) {
       int l = nums.length;
       int j=1;
       for(int i = 1; i<l; i++){
        if(nums[i] != nums[i-1]){
            nums[j] = nums[i];
            j++;
        }
       }
       return j;
    }
}