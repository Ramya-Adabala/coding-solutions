# Smallest window containing 0, 1 and 2

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting only of the characters ' **0'**, ' **1'**  and ' **2'**, determine the length of the  **smallest substring**  that contains all three characters at least once.

If no such substring exists, return  **-1**.

 **Examples :** 

```
Input: s = "10212"
Output: 3
Explanation: The substring "102" is the shortest substring that contains all three characters '0', '1', and '2', so the answer is 3.
```

```
Input: s = "12121"
Output: -1
Explanation: The character '0' is not present in the string, so no substring can contain all three characters '0', '1', and '2'. Hence, the answer is -1.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T10:58:35.833Z  

```java

        class Solution {
    public int smallestSubstring(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        int count0 = 0, count1 = 0, count2 = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            char c = s.charAt(r);
            if (c == '0') count0++;
            else if (c == '1') count1++;
            else if (c == '2') count2++;

           
            while (count0 > 0 && count1 > 0 && count2 > 0) {
                ans = Math.min(ans, r - l + 1);

               
                char leftChar = s.charAt(l);
                if (leftChar == '0') count0--;
                else if (leftChar == '1') count1--;
                else count2--;
                l++;
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1)