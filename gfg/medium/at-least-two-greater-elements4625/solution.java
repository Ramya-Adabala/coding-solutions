class Solution {
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            al.add(arr[i]);
        }
        return al;
    }
};