# NCOPIES - Rating 838

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T05:28:28.471Z  

```java
class Solution {
    public int countNonMinimum(int[] nums) {
        if (nums.length == 0) return 0;

        int minimum = nums[0];
        int countMin = 0;

        // Find minimum
        for (int num : nums) {
            if (num < minimum) minimum = num;
        }

        // Count occurrences of minimum
        for (int num : nums) {
            if (num == minimum) countMin++;
        }

        return nums.length - countMin;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NCOPIES)