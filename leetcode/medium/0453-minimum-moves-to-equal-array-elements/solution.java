class Solution {
    public int minMoves(int[] nums) {
        int count=Integer.MAX_VALUE;
        for(int x:nums){
            if(x<count) count=x;
        }
        long moves=0;
        for(int x:nums) moves+=x-count;
        return (int) moves;
    }
}