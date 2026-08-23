class Solution {
    public int missingNumber(int[] nums) {
      int l = nums.length;
      int sum = 0;
      for(int i = 0; i< l; i++){
        sum += nums[i];
      }  
      int missing= l*(l+1)/2;
        for(int i = 0; i<l; i++){
          if(sum != missing){
              return (missing-sum);
          }
        }
      return 0;
    }
} 