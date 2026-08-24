class Solution {
    public String convert(String s, int numRows) {
       int l= s.length();
        if(numRows == 1 || numRows>= l){
            return s;
        }
        String [] rows = new String[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = "";
        }
        int i=0;
        while(i < l){
            for(int j=0; j<numRows && i<l; j++){
                rows[j] += s.charAt(i++);
            }
            for(int j=numRows-2; j>0 && i<l; j--){
                rows[j] += s.charAt(i++);
            }
        }
        String res ="";
        for(String str: rows){
            res += str;
        } 
           return res;  
    }
}