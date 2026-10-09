class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int i=0,j=1,k=2;
        int count=0;
        while(k<n){
            if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0){
                return true;
            }
            i++;
            j++;
            k++;
        }
        return false;
    }
}