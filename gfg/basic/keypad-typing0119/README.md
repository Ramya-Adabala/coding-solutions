# Keypad Typing

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  consisting of lowercase English letters. Each letter corresponds to a number on a standard keypad, as shown in the figure. Replace every character in s with its corresponding keypad number and return the resulting numeric string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 4335736743357
Explanation: Each character in the string "geeksforgeeks" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 4335736743357, which is the required decimal representation.

```

```
Input: s = "geeksquiz"
Output: 433577849
Explanation: Each character in the string "geeksquiz" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 433577849, which is the required decimal representation.
```

 **Constraints:** 
1 ≤ s.size() ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T09:53:31.096Z  

```java
import java.util.HashMap;

class Solution {
    public String printNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        map.put('a', 2); map.put('b', 2); map.put('c', 2);
        map.put('d', 3); map.put('e', 3); map.put('f', 3);
        map.put('g', 4); map.put('h', 4); map.put('i', 4);
        map.put('j', 5); map.put('k', 5); map.put('l', 5);
        map.put('m', 6); map.put('n', 6); map.put('o', 6);
        map.put('p', 7); map.put('q', 7); map.put('r', 7); map.put('s', 7);
        map.put('t', 8); map.put('u', 8); map.put('v', 8); 
        map.put('w', 9); map.put('x', 9); map.put('y', 9); map.put('z', 9);

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                ans.append(map.get(ch));
            }
        }

        return ans.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/keypad-typing0119/1)