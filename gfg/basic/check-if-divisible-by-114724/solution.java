class Solution {
    public boolean divisibleBy11(String s) {
        // code here
        int r=0;
        for(int i=0;i<s.length();i++){
            r=((r*10)+(s.charAt(i)-'0'))%11;
            
        }
        return r==0?true:false;
    }
};