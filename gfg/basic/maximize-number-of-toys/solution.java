class Solution {
    public static int maxToys(int arr[], int k) {
        // code here
        int n=arr.length;
        int sum=0,count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<=k)
            count++;
        }
        return count;
    }
}