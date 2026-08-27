class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> al=new ArrayList<>();
        for(String s:words){
            if(isin(s,row1)|| isin(s,row2)|| isin(s,row3)){
                al.add(s);
            }
        }
        return al.toArray(new String[0]);
    }

    public static boolean isin(String s,String row){
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(row.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}