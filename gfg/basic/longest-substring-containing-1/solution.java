class Solution {
    public int longestSubstring(String s) {
        // code here
        int max=0,count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
            else{
                if(max<count){
                    max=count;
                }
            count=0;}}
            if(max<count)
            return count;
        return max;
    }
}