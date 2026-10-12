class Solution {
    public static boolean checkPangram(String s) {
        // code here
           HashSet<Character> obj=new HashSet<>();
        for(char ch:s.toLowerCase().toCharArray()){
            if(ch>='a'&& ch<='z')
            obj.add(ch);
        }
        if(obj.size()==26)
        return true;
        else return false;
    }
}