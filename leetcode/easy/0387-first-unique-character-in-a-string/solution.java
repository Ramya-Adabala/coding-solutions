class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> obj=new LinkedHashMap<>();
        for(char n:s.toCharArray()){
            obj.put(n,obj.getOrDefault(n,0)+1);
}
       for(int i=0;i<s.length();i++){
        if(obj.get(s.charAt(i))==1)
        return i;
       }
       return -1;
    }
}