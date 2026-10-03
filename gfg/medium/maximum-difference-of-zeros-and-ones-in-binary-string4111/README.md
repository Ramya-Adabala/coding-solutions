# maximum-difference-of-zeros-and-ones-in-binary-string4111

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T11:12:24.714Z  

```java
class Solution {
    int maxSubstring(String s) {
        // code here
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(char ch:s.toCharArray()){
            int val=(ch=='0')?1:-1;
            currSum=Math.max(val,currSum+val);
            maxSum=Math.max(maxSum,currSum);
        }
        return (maxSum<=0)?-1:maxSum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1)