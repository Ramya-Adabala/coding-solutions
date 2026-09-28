# power-of-2-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T13:57:11.553Z  

```java
class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n==0) return false;
        while(n>1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1)