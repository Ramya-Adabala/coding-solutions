class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();int k=0;
        int m=s.length();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' ')
             break;
        
        k++;}
return k;
    }
}