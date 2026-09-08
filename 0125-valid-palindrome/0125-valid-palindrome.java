class Solution {
    public boolean isPalindrome(String s) {
        String lc = s.toLowerCase();
        String result = lc.replaceAll("[^a-z0-9]", "");
        int n = result.length();
        String ans="";
        for(int i=n-1; i>=0; i--){
           ans = ans+ result.charAt(i);
        }
        System.out.print(ans);
          if(!ans.equals(result)){
           return false;
          }
           return true;
    }
}