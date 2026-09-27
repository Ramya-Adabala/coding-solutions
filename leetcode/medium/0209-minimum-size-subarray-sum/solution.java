class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
int sum=0,left=0;
        int ans = Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                int len=right-left+1;
                ans=Math.min(len,ans);
                sum-=nums[left];
                left++;
            }
            
        }
        if(ans==Integer.MAX_VALUE)
        return 0; else return ans;
    }
}