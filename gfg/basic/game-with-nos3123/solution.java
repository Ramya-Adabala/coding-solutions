class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int x=arr[i]^arr[i+1];
            al.add(x);
    }
    al.add(arr[n-1]);
    return al;
}
}