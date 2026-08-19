class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       int l = nums.length;
       long first = Long.MIN_VALUE;
      long second = Long.MIN_VALUE;
       long thirdmax= Long.MIN_VALUE;
       int max = nums[l-1];
        boolean hasthirdmax = false;
       
       if(l>2){
            for(int i = 0; i<l; i++){
               if(nums[i]> first){
                   first = nums[i];
                }
            }
            for(int i = 0; i<l; i++){
                if(nums[i] != first && nums[i]> second){
                    second = nums[i];
                }
            }
            for(int i = 0; i<l; i++){
                if(nums[i] != first && nums[i] != second && nums[i]>thirdmax){
                    thirdmax= nums[i];
                    hasthirdmax = true;
                }
            }
           if(hasthirdmax == true){
               return (int)thirdmax;
            }
       }
    return max ;
    }
              
}