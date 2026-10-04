# find-first-repeated-character4108

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T10:43:28.565Z  

```java
class Solution {
    String firstRepChar(String s) {
        // code here
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
        int idx = c - 'a';
        if (seen[idx]) {
        return String.valueOf(c);
        }
        seen[idx] = true;
        }

        return "-1";
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1)