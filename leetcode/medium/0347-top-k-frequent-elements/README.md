# Top K Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `k`  *most frequent elements*. You may return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  nums = [1,1,1,2,2,3], k = 2

 **Output:**  [1,2]

 **Example 2:** 

 **Input:**  nums = [1], k = 1

 **Output:**  [1]

 **Example 3:** 

 **Input:**  nums = [1,2,1,2,1,2,3,1,3,2], k = 2

 **Output:**  [1,2]

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

 

 **Follow up:**  Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 54.88%)  
**Memory:** 47.6 MB (beats 66.72%)  
**Submitted:** 2026-09-16T06:10:22.037Z  

```java
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
       ArrayList<Map.Entry<Integer,Integer>> al =
                new ArrayList<>(hm.entrySet());
       al.sort((a,b)->b.getValue()-a.getValue());
       int last[]=new int[k];
       for(int i=0;i<k;i++){
        last[i]=al.get(i).getKey();       }
return last;
        }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-elements/)