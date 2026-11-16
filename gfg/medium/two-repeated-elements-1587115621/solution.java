class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        
    int[] a = new int[2];
            int j = 0;
            HashSet<Integer>set = new HashSet<>();
            for(int i = 0;i<arr.length;i++){
                if(set.contains(arr[i])){
                    a[j++] = arr[i];
                }
                else{
                    set.add(arr[i]);
                }
            }

            return a;
}}