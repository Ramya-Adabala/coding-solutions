# Word Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here  **follow**  means a full match, such that there is a bijection between a letter in `pattern` and a  **non-empty**  word in `s`. Specifically:

- Each letter in pattern maps to exactly one unique word in s.
- Each unique word in s maps to exactly one letter in pattern.
- No two letters map to the same word, and no two words map to the same letter.

 

 **Example 1:** 

 **Input:**  pattern = "abba", s = "dog cat cat dog"

 **Output:**  true

 **Explanation:** 

The bijection can be established as:

- 'a' maps to "dog".
- 'b' maps to "cat".

 **Example 2:** 

 **Input:**  pattern = "abba", s = "dog cat cat fish"

 **Output:**  false

 **Example 3:** 

 **Input:**  pattern = "aaaa", s = "dog cat cat dog"

 **Output:**  false

 

 **Constraints:** 

- 1 <= pattern.length <= 300
- pattern contains only lower-case English letters.
- 1 <= s.length <= 3000
- s contains only lowercase English letters and spaces ' '.
- s does not contain any leading or trailing spaces.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 12.23%)  
**Memory:** 42.8 MB (beats 55.71%)  
**Submitted:** 2026-08-30T10:02:40.587Z  

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words=s.split("\\s+");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w = words[i];
        
        if(map1.containsKey(c) && !map1.get(c).equals(w)){
            return false;
        }

        if(map2.containsKey(w) && map2.get(w)!=c){
            return false;
        }
        map1.put(c, w);
        map2.put(w, c);
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/word-pattern/)