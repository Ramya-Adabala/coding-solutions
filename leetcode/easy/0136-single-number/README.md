# Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **non-empty**  array of integers `nums`, every element appears  *twice*  except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [2,2,1]

 **Output:**  1

 **Example 2:** 

 **Input:**  nums = [4,1,2,1,2]

 **Output:**  4

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  1

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104
- Each element in the array appears twice except for one element which appears only once.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 19.51%)  
**Memory:** 46.3 MB (beats 86.90%)  
**Submitted:** 2026-11-13T11:49:59.495Z  

```java
class Solution {
    public int singleNumber(int[] nums) {
     Map<Integer,Integer> hm=new HashMap<>();
     for(int x:nums){
        hm.put(x,hm.getOrDefault(x,0)+1);
     }
     for(int x:nums){
        if(hm.get(x)==1)
        return x;
     }
     return -1;
    }

}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)