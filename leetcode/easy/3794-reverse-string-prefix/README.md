# Reverse String Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` and an integer `k`.

Reverse the first `k` characters of `s` and return the resulting string.

 

 **Example 1:** 

 **Input:**  s = "abcd", k = 2

 **Output:**  "bacd"

 **Explanation:** ​​​​​​​

The first `k = 2` characters `"ab"` are reversed to `"ba"`. The final resulting string is `"bacd"`.

 **Example 2:** 

 **Input:**  s = "xyz", k = 3

 **Output:**  "zyx"

 **Explanation:** 

The first `k = 3` characters `"xyz"` are reversed to `"zyx"`. The final resulting string is `"zyx"`.

 **Example 3:** 

 **Input:**  s = "hey", k = 1

 **Output:**  "hey"

 **Explanation:** 

The first `k = 1` character `"h"` remains unchanged on reversal. The final resulting string is `"hey"`.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 53.83%)  
**Memory:** 44 MB (beats 93.22%)  
**Submitted:** 2026-10-26T04:51:28.611Z  

```java
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder ();
        for(int i=k-1;i>=0;i--){
         sb.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-prefix/)