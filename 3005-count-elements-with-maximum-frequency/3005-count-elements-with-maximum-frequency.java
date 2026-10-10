class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int freq, maxfreq=0;
        int total =0;
        
        for(int i: nums){
            freq = map.getOrDefault(i,0)+1;
            map.put(i, freq);  
         
           if(maxfreq < freq){
             maxfreq = freq;
             total = freq;
            
            }
            else if(freq == maxfreq){
              total += freq;   
            }
                                    
        }
        return total; 
    }
}