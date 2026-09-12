class Solution {
    public boolean checkRecord(String s) {
        int count1=0,count2=0;
        for(char ch: s.toCharArray()){
            if(ch!='L') count1=0;
            if(ch=='L') count1++;
            if(ch=='A') count2++;

        
        if(count1==3 || count2==2) return false;}
        return true;
    }
}