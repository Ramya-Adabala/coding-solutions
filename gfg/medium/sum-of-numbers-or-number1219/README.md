# sum-of-numbers-or-number1219

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T06:39:53.779Z  

```java
class Solution {
    String findSum(String s1, String s2) {
        // code here
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        BigInteger res=b1.add(b2);
        return res.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1)