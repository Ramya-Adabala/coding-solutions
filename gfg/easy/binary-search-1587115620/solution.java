class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l=0,r=arr.length-1;
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==k){
            res=m;
            r=m-1;}
            else if(arr[m]<k)
            l=m+1;
            else r=m-1;
        }
        return res;
    }
}