# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

 

 **Example 1:** 

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

```

 **Example 2:** 

```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

```

 **Example 3:** 

```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

```

 

 **Constraints:** 

- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 36 ms (beats 28.56%)  
**Memory:** 59.2 MB (beats 45.23%)  
**Submitted:** 2026-09-08T04:06:55.139Z  

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> li=new ArrayList<>();
       int target=0;
       Arrays.sort(nums);
       int n=nums.length;
      for(int i=0;i<n-2;i++){
        if(i>0 &&nums[i]==nums[i-1]) continue;
        int l=i+1,r=n-1;
       while(l<r){
        int sum=nums[i]+nums[l]+nums[r];
        if(sum==target) {
            li.add(Arrays.asList(nums[i],nums[l],nums[r]));
            while(l<r&& nums[l]==nums[l+1]) l++;
            while(l<r && nums[r]==nums[r-1]) r--;
            l++;r--;
            }
        else if(sum>target) r--;
        else {
            l++;
        }

       }}
       return li;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum/)