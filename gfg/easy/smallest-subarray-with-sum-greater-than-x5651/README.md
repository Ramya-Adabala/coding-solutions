# Smallest Subarray Sum Greater Than x

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **x** and an array of integers  **arr**, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

 **Examples:** 

```
Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
Output: 3
Explanation: Minimum length subarray is [4, 45, 6]
```

```
Input: x = 100, arr[] = [1, 10, 5, 2, 7]
Output: 0
Explanation: No subarray exist
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T06:44:42.216Z  

```java

        class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            
            // Shrink the window from the left while sum > x
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)