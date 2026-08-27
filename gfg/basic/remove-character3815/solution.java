class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        String res="";
        for(char ch:str1.toCharArray()){
            if(! str2.contains(String.valueOf(ch))){
                res+=ch;
        }}
        return res;
    }
}