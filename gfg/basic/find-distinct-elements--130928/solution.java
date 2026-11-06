// User function Template for Java
class Solution {
    public static int countDistinct(int arr[]) {
        // Your code here
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            hs.add(x);
        }
        return hs.size();
    }
}
