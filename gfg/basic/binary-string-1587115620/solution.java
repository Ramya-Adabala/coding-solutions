class Solution {
    public int binarySubstring(String s) {
        // code here
        int n=s.length();
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='1')
            c++;
        }
        return c*(c-1)/2;
    }
}