class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(keys[i],arr[i]);
            
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        else return -1;
    }
}