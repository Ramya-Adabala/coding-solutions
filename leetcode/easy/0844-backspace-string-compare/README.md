# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 60.24%)  
**Memory:** 42.9 MB (beats 78.38%)  
**Submitted:** 2026-10-07T10:19:16.797Z  

```java
class Solution {

    // Helper method to simulate string typing and backspace handling 🗂️
    public String eval(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                stk.push(ch); // Type a normal character
            } else if (!stk.isEmpty()) {
                stk.pop();    // Process backspace by removing the last typed character ✂️
            }
        }
        
        // Reconstruct the final string from the remaining stack elements
        StringBuilder res = new StringBuilder();
        for (char ch : stk) {
            res.append(ch);
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        // Evaluate both strings and verify if their final configurations are identical
        return eval(s).equals(eval(t));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)