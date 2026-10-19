class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<String, Character> map = new HashMap<>();
        HashMap<Character, String> map2 = new HashMap<>();
    
        String[] word =s.split(" ");
        if(pattern.length()!= word.length){
            return false; 
        }
        for(int i = 0; i<pattern.length(); i++){
         String a  = word[i];
         char b = pattern.charAt(i);
         if(map.containsKey(a)&& map.get(a) != b){
            return false;
         }
         if(map2.containsKey(b) && !map2.get(b).equals(a)){
            return false;
         }
         map.put(a,b);
         map2.put(b,a);   
        }
      return true;
    }
}