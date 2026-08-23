# First Unique Character in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, find the  **first**  non-repeating character in it and return its index. If it  **does not**  exist, return `-1`.

 

 **Example 1:** 

 **Input:**  s = "leetcode"

 **Output:**  0

 **Explanation:** 

The character `'l'` at index 0 is the first character that does not occur at any other index.

 **Example 2:** 

 **Input:**  s = "loveleetcode"

 **Output:**  2

 **Example 3:** 

 **Input:**  s = "aabb"

 **Output:**  -1

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 30.84%)  
**Memory:** 46.9 MB (beats 57.99%)  
**Submitted:** 2026-08-23T14:50:00.052Z  

```java
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> obj=new LinkedHashMap<>();
        for(char n:s.toCharArray()){
            obj.put(n,obj.getOrDefault(n,0)+1);
}
       for(int i=0;i<s.length();i++){
        if(obj.get(s.charAt(i))==1)
        return i;
       }
       return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/)