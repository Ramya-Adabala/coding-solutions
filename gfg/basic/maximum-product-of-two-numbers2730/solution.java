class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1]*arr[n-2];
    }
}
