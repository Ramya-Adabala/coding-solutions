# Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only  **one repeated number**  in `nums`, return  *this repeated number*.

You must solve the problem  **without**  modifying the array `nums` and using only constant extra space.

 

 **Example 1:** 

```
Input: nums = [1,3,4,2,2]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,1,3,4,2]
Output: 3

```

 **Example 3:** 

```
Input: nums = [3,3,3,3,3]
Output: 3
```

 

 **Constraints:** 

- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

 

 **Follow up:** 

- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 40 ms (beats 5.88%)  
**Memory:** 121.4 MB (beats 5.45%)  
**Submitted:** 2026-10-01T02:15:56.682Z  

```java
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> obj=new LinkedHashMap<>();
        for(int n:nums){
            obj.put(n,obj.getOrDefault(n,0)+1);
}
       for(int n:nums){
        if(obj.get(n)>=2)
        return n;
       }
       return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)