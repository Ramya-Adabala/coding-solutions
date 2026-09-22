class Solution {
    public int solve(int b, List<Integer> arr) {
        // code here
        int n=arr.size();
        for(int i=0;i<n;i++)    {
            if(arr.get(i)==b){
                b+=arr.get(i);
            }
        }
        return b;
    }
}