class Solution {
    public void reverseString(char[] s) {
     int l= s.length;
     char temp;
     int i = 0;
     int j =s.length-1;
     while(i<j){
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;

       i++;
       j--;
     }
     System.out.println(s);
    }
}