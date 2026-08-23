class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n = grid.length;
      int total = n*n;
      int[] c= new int[total+1];
      for(int i= 0; i< n; i++){
        for(int j = 0; j<n; j++){
            c[grid[i][j]]++;
        }
      }
      int missing= -1;
      int repeated = -1;
      
        for(int i=0; i<= total; i++){
            if(c[i]==2){
                repeated = i;
            }
            if(c[i] == 0){
                missing = i;
            }
        } 
           
      
    return new int[]{repeated, missing} ; 
    }
}