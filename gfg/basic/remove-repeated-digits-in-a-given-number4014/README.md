# Remove Repeated Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number n, remove consecutive repeated digits from it.

 **Examples:** 

```
Input: n = 1224
Output: 124
Explanation: Two consecutive occurrences of 2 have been reduced to one.

```

```
Input: n = 1242
Output: 1242
Explanation: No digit is repeating consecutively in n.

```

 **Constraints:** 
1<=n<=1018

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T13:18:14.034Z  

```java

class Solution {
     public long modify(long N) {
         // code here          
  String s = Long.toString(N);
  StringBuilder result = new StringBuilder();
  result.append(s.charAt(0));

  for (int  i=1; i<s.length();i++){
      if (s.charAt(i) != s.charAt(i - 1)) {
          result.append(s.charAt(i));

      }
     }
     return Long.parseLong(result.toString());
 }
 }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-repeated-digits-in-a-given-number4014/1)