# last-index-of-15847

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T09:23:28.044Z  

```java
// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') return i;
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-index-of-15847/1)