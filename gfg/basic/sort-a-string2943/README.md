# Sort String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

 **Examples:** 

```
Input: s = "edcab"
Output: "abcde"
Explanation: characters are in ascending order in "abcde".

```

```
Input: s = "xzy"
Output: "xyz"
Explanation: characters are in ascending order in "xyz".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T14:19:59.350Z  

```java
// User function Template for Java
class Solution {
    String sortString(String s) {
        // code here
       
       char ch[] = s.toCharArray();
       Arrays.sort(ch);
       return new String(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-string2943/1)