class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
       
        if(s.length() != t.length()){
            return false;
        }
        for(char i: s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char j:t.toCharArray()){
           map2.put(j, map2.getOrDefault(j,0)+1);
        }
        return map.equals(map2);
         
    }
}