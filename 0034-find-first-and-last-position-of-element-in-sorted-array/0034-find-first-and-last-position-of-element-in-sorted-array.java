class Solution {
    public int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findfirst(nums, target);
        result[1] = findlast(nums, target);
        return result;
    } 
    private int findfirst(int[] nums, int target) {
        int l = nums.length;
        int lh=0, uh=l-1;
        
        int index = -1;
        int found = 0;
        while(lh<=uh){
            int mid = lh+(uh-lh)/2;
            if(target == nums[mid] ){
                index = mid;
                uh = mid-1;
                
            }else if(target < nums[mid]){
                uh = mid - 1; 
                   
            }
            else{
               
                lh = mid +1;
            }           
        }
       
    return index;
    }
    private int findlast(int[] nums, int target){
        int lh=0;
        int uh = nums.length-1;
        int index=-1;
        while(lh<=uh){
            int mid = lh+(uh-lh)/2;
            if(target == nums[mid]){
                index = mid;
                lh = mid+1;
            }

            else if(target <nums[mid]){
                uh = mid-1;
            }
            else{
                lh = mid+1;
            }
            
        }
    return index;
    }
}