# power-using-recursion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:01:49.271Z  

```java
class Solution {
    public int recursivePower(int n, int p) {
        // code here
        if(p==0) return 1;
        return n*recursivePower(n,p-1);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-using-recursion/1)