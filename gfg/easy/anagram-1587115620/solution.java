class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(Character ch1:s1.toCharArray()){
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
        }
        for(Character ch2:s2.toCharArray()){
            hm.put(ch2,hm.getOrDefault(ch2,0)-1);
        }
        for(int count:hm.values()){
            if(count!=0) return false;
        }
        return true;
    }
}