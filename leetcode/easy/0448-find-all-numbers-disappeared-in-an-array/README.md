# Find All Numbers Disappeared in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return  *an array of all the integers in the range*  `[1, n]`  *that do not appear in*  `nums`.

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

```

 **Example 2:** 

```
Input: nums = [1,1]
Output: [2]

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n

 

 **Follow up:**  Could you do it without extra space and in `O(n)` runtime? You may assume the returned list does not count as extra space.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 53.38%)  
**Memory:** 66.4 MB (beats 96.94%)  
**Submitted:** 2026-11-07T03:55:33.992Z  

```java
class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans = new ArrayList<>();

    for (final int num : nums) {
      final int index = Math.abs(num) - 1;
      nums[index] = -Math.abs(nums[index]);
    }

    for (int i = 0; i < nums.length; ++i)
      if (nums[i] > 0)
        ans.add(i + 1);

    return ans;
  }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)