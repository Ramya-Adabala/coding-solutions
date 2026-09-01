class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int chars[]=new int[26];
        for(char c:magazine.toCharArray()){
            chars[c-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(chars[ch-'a']==0){
                return false;
            }
            chars[ch-'a']--;
        }
        return true;
    }
}