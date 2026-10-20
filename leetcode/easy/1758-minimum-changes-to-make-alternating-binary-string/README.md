# Minimum Changes To Make Alternating Binary String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting only of the characters `'0'` and `'1'`. In one operation, you can change any `'0'` to `'1'` or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string `"010"` is alternating, while the string `"0100"` is not.

Return  *the  **minimum**  number of operations needed to make*  `s`  *alternating*.

 

 **Example 1:** 

```
Input: s = "0100"
Output: 1
Explanation: If you change the last character to '1', s will be "0101", which is alternating.

```

 **Example 2:** 

```
Input: s = "10"
Output: 0
Explanation: s is already alternating.

```

 **Example 3:** 

```
Input: s = "1111"
Output: 2
Explanation: You need two operations to reach "0101" or "1010".

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s[i] is either '0' or '1'.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 81.60%)  
**Memory:** 43.3 MB (beats 93.72%)  
**Submitted:** 2026-10-20T13:17:13.901Z  

```java
class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int i=0;
        int count=0;
        while(i<n){
            char expected=(i%2==0)?'0':'1';
            if(s.charAt(i)!=expected){
                count++;
            }
            i++;
        }
        return Math.min(count,n-count);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/)