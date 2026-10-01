# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 16.87%)  
**Submitted:** 2026-10-01T15:23:26.901Z  

```java
class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s==null || s.length==0) return "";
        String pref=s[0];
         int preflen=pref.length();
         for(int i=1;i<s.length;i++){
            String st=s[i];
            while(preflen>st.length() || !pref.equals(st.substring(0,preflen))){
                preflen--;
                if(preflen==0) return "";
                pref=pref.substring(0,preflen);
            }
         }
         return pref;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)