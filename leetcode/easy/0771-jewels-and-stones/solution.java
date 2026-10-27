class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length(); int m=jewels.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:stones.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char j:jewels.toCharArray()){
            count+=hm.getOrDefault(j,0);
        }
        return count;
    }
}