class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int a=0,b=0,temp ;
        for(int n:arr){
            temp=a;
            a=b;
            b=Math.max(n+temp,b);
        }
        return b;
    }
}