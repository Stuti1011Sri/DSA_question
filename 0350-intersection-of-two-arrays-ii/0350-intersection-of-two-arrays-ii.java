class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        int n = nums1.length;
        for(int i :nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        } 
        List<Integer> answer= new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i) && map.get(i)>0){
                answer.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        int[] result = new int[answer.size()];
        for( int j=0; j<answer.size(); j++){
           result[j] = answer.get(j);
        }
        return result;
    }  
}