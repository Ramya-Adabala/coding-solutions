class Solution {
    public int getCandidate(int n, int k) {
        // code here
        int c=0;
        while(n>=k){
            n=n/k;
            c++;
        }
        return (int)Math.pow(k,c);
    }
}