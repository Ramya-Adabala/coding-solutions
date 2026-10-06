# Check if divisible by 11

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **s**. Check whether it is divisble by 11 or not.

 **Examples:** 

```
Input: s = 76945
Output: true
Explanation: The number is divisible by 11 as 76945 % 11 = 0.

```

```
Input: s = 12
Output: false
Explanation: The number is not divisible by 11 as 12 % 11 = 1.

```

 **Constraints:** 
1 ≤ |s| ≤ 101000+5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T09:25:00.867Z  

```java
class Solution {
    public boolean divisibleBy11(String s) {
        // code here
        int r=0;
        for(int i=0;i<s.length();i++){
            r=((r*10)+(s.charAt(i)-'0'))%11;
            
        }
        return r==0?true:false;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-divisible-by-114724/1)