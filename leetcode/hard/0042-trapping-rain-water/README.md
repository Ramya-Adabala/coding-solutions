# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 58.54%)  
**Memory:** 47.1 MB (beats 97.84%)  
**Submitted:** 2026-10-21T14:08:56.246Z  

```java
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int leftMax=height[l],rightMax=height[r];
        int water=0;
        while(l<r){
            if(height[l]<height[r]){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                water+=leftMax-height[l];
            }
            else{
                 r--;
                rightMax=Math.max(rightMax,height[r]);
                water+=rightMax-height[r];
            }
        }
        return water;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)