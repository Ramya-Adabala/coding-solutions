class Solution {
    public int balancedStringSplit(String s) {
        int bal=0,c=0;
        for(char ch:s.toCharArray()){
            if(ch=='L') bal++;
            else if(ch=='R') bal--;
            if(bal==0) c++;
        }
        return c;
    }
}