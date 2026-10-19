class Solution {
    public boolean isHappy(int n) {   
        HashSet<Integer> seen = new HashSet<>();
      while(n != 1){
          if(seen.contains(n)){
            return false;
          }
          seen.add(n);
          n = squareSum(n);
      }
      return true;
    }
    public int squareSum(int n){
        int sum=0;
      while(n>0){
        int d= n%10;
        sum += d*d;
        n = n/10;
      }
      return sum;
    }
}