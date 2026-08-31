# Remainder with 7

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number as string  **n**, return the remainder of the number when it is divided by 7.

 **Examples :** 

```
Input: n = "5" 
Output: 5
Explanation: Since 5 is less than 7, the remainder when divided by 7 is 5.

```

```
Input: n = "8"
Output: 1
Explanation: 8 divided by 7 leaves remainder 1.
```

 **Constraints:** 
1 ≤ |n| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T05:56:55.640Z  

```java
// User function Template for Java

class Solution {
    static int remainderWith7(String N) {
        // code here
    int rem=0;
    for(int i=0;i<N.length();i++){
        int d=N.charAt(i)-'0';
        rem=(rem*10+d)%7;
    }
    return rem;
        
        
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remainder-with-7/1)