class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
       int c1=0,c2=0,c3=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0) c1++;
       }
       for(int i=0;i<n;i++){
        if(nums[i]==1) c2++;
       }
       for(int i=0;i<n;i++){
        if(nums[i]==2) c3++;
       }
int index=0;
       for(int i=0;i<c1;i++){
        nums[index++]=0;
       }
         for(int i=0;i<c2;i++){
        nums[index++]=1;
       }
         for(int i=0;i<c3;i++){
        nums[index++]=2;
       }
    }
}