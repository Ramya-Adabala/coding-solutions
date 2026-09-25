# Duplicate Zeros

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a fixed-length integer array `arr`, duplicate each occurrence of zero, shifting the remaining elements to the right.

 **Note**  that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

 **Example 1:** 

```
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

```

 **Example 2:** 

```
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

```

 

 **Constraints:** 

- 1 <= arr.length <= 104
- 0 <= arr[i] <= 9

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.50%)  
**Memory:** 47 MB (beats 41.66%)  
**Submitted:** 2026-09-25T09:01:23.021Z  

```java
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        int length = n - 1;

        // 1. Count how many zeros fit into the original array bounds
        for (int left = 0; left <= length - zeros; left++) {
            if (arr[left] == 0) {
                // If a zero occurs at the edge, its duplicate will drop off
                if (left == length - zeros) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                zeros++;
            }
        }

        // 2. Shift backwards to avoid overwriting unread values
        int last = length - zeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/duplicate-zeros/)