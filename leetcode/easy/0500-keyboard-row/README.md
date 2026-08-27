# Keyboard Row

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings `words`, return  *the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below*.

 **Note**  that the strings are  **case-insensitive**, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the  **American keyboard** :

- the first row consists of the characters "qwertyuiop",
- the second row consists of the characters "asdfghjkl", and
- the third row consists of the characters "zxcvbnm".

 

 **Example 1:** 

 **Input:**  words = ["Hello","Alaska","Dad","Peace"]

 **Output:**  ["Alaska","Dad"]

 **Explanation:** 

Both `"a"` and `"A"` are in the 2nd row of the American keyboard due to case insensitivity.

 **Example 2:** 

 **Input:**  words = ["omk"]

 **Output:**  []

 **Example 3:** 

 **Input:**  words = ["adsdf","sfd"]

 **Output:**  ["adsdf","sfd"]

 

 **Constraints:** 

- 1 <= words.length <= 20
- 1 <= words[i].length <= 100
- words[i] consists of English letters (both lowercase and uppercase).

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.7 MB (beats 83.73%)  
**Submitted:** 2026-08-27T04:14:17.003Z  

```java
class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> al=new ArrayList<>();
        for(String s:words){
            if(isin(s,row1)|| isin(s,row2)|| isin(s,row3)){
                al.add(s);
            }
        }
        return al.toArray(new String[0]);
    }

    public static boolean isin(String s,String row){
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(row.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/keyboard-row/)