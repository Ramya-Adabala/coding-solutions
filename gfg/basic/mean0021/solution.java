class Solution {
    public static int findMean(int[] arr) {
        // code here
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return (int)Math.floor(sum/n);
    }
};