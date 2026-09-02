# Isomorphic Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`,  *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

 **Example 1:** 

 **Input:**  s = "egg", t = "add"

 **Output:**  true

 **Explanation:** 

The strings `s` and `t` can be made identical by:

- Mapping 'e' to 'a'.
- Mapping 'g' to 'd'.

 **Example 2:** 

 **Input:**  s = "f11", t = "b23"

 **Output:**  false

 **Explanation:** 

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

 **Example 3:** 

 **Input:**  s = "paper", t = "title"

 **Output:**  true

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- t.length == s.length
- s and t consist of any valid ascii character.

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 5.23%)  
**Memory:** 43.9 MB (beats 41.95%)  
**Submitted:** 2026-09-02T04:15:59.967Z  

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
Map<Character,Character> obj1=new HashMap<>();
Map<Character,Character> obj2=new HashMap<>();
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    char th=t.charAt(i);
    if(obj1.containsKey(ch) && obj1.get(ch)!=th)
 return false;
 if(obj2.containsKey(th) && obj2.get(th)!=ch)
 return false;
 obj1.put(ch,th);
 obj2.put(th,ch);
 }
 return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/isomorphic-strings/)