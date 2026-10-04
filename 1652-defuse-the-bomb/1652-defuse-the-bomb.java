class Solution {
    public int[] decrypt(int[] code, int k) {
        int sum1=0;
        int sum2=0;
        int n=code.length;
        int [] result = new int[n];
        if(k==0){
            return result;
        }
        int start = 1;
        int end= k;
        if(k<0){
            start = n+k;
            end = n-1;
        }
        int sum =0;
        for(int i =start; i<= end; i++){
            sum = sum+ code[i];
        }
        for(int i=0; i<n; i++){
            result[i] =  sum;
            sum = sum-code[start%n];
            sum += code[(end+1)%n];
            start++;
            end++;
        }
        return result;

    }
}