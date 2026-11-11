class Solution {
    public int countSegments(String s) {
        int count=0;
        String []st=s.split(" ");
        for(String w:st){
            if(!w.isEmpty()){
                count++;
            }
        }
        return count;

    }
}