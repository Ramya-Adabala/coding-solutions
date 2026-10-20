class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int i=0;
        int count=0;
        while(i<n){
            char expected=(i%2==0)?'0':'1';
            if(s.charAt(i)!=expected){
                count++;
            }
            i++;
        }
        return Math.min(count,n-count);
    }
}