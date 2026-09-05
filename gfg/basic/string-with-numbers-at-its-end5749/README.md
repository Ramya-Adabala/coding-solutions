# String with Number at End

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given string  **s**  that is appended with a number at last. The task is to check whether the length of string excluding that number is equal to that number.

 **Examples:** 

```
Input:  s = "geeks5"
Output: 1
Explanation: Length of geeks is 5 and the last number is also 5.
```

```
Input:  s = "geek5"
Output: 0
Explanation: Length of geek is 4 and the last number is 5.

```

 **Constraints:** 
1 <= |s| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:14:42.557Z  

```java
class Solution {
    int isSame(String s) {
        // code here
       int i = s.length() - 1, num = 0, p = 1;
               while (i >= 0 && Character.isDigit(s.charAt(i))) {
                   num = (s.charAt(i--) - '0') * p + num;
                   p *= 10;
               }
                return (i + 1 == num) ? 1 : 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-with-numbers-at-its-end5749/1)