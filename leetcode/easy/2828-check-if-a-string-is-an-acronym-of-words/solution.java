class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        StringBuilder sb=new StringBuilder();
        for(String word:words){
             char ch=word.charAt(0);
             sb.append(ch);
        }
        if(sb.toString().equals(s)){
            return true;
        }
        else return false;
    }
}