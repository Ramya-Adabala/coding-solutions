# trailing-zeroes-in-factorial5134

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T03:06:00.577Z  

```java
class Solution {
    public static int trailingZeroes(int n) {
        // code here
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1)