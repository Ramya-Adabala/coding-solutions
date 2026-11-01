// User function Template for Java

class Solution {
    boolean sumOfRowCol( int A[][]) {
        int N=A.length;int M=A[0].length;
       int v=Math.min(N,M);
        int rsum=0,csum=0;
        for(int i=0;i<v;i++){
            for(int j=0;j<M;j++){
                rsum+=A[i][j];
            }
            for(int k=0;k<N;k++){
                csum+=A[k][i];
            }
            if(rsum!=csum){
                return false;
            }
        }
        return true;
    }
}