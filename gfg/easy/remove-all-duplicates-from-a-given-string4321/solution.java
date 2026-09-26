class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(!hs.contains(ch)){
            hs.add(ch);
         sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}
