# Remove Characters from Alphanumeric String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **s**. Remove all characters except the numeric characters from an alphanumeric string.

 **Examples:** 

```
Input: s = "AA1d23cBB4"
Output: "1234"
Explanation: Remove all characters other than numbers
```

```
Input: s= "a1b2c3"
Output: "123"
Explanation: Remove all characters other than numbers
```

 **Constraints:** 
1 <= |s| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T05:56:49.968Z  

```java
// User function Template for Java

class Solution {
    String removeCharacters(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char m=s.charAt(i);
            if(Character.isDigit(m))
            sb.append(m);
        }
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1)