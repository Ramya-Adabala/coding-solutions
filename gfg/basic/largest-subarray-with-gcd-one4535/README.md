# Longest Subarray with GCD One

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr** []. Return the length of the largest subarray having GCD (Greatest Common divisor) equal to 1.

If no such  subarray exist with GCD 1, return **-1**.

 **Examples:** 

```
Input: arr[] = [1, 3, 5]
Output: 3 
Explanation: GCD of 1, 3 and 5 is equal to 1. So the length is 3. 

```

```
Input: arr[] = [2, 4, 6]
Output: -1
Explanation: No subarray exist with GCD = 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:39:21.596Z  

```java
class Solution {
    public int longestSubarray(int[] arr) {
        // code here
        int n=arr.length;
        int x = arr[0];
        for(int i=1;i<n;i++)
        {
            x = gcd(x,arr[i]);
        }
        if(x==1)
            return n;
        else
            return -1;
    }
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-subarray-with-gcd-one4535/1)