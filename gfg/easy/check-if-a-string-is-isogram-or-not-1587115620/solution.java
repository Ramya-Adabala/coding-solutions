

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:data.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                return false;
            }
        }
        return true;
    }
}