# Uncommon characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given two strings  **s1**  and  **s2**. Your task is to identify the characters that appear in either string but not in both (i.e., characters that are unique to one of the strings). Return the result as a sorted string.

 **Examples:** 

```
Input: s1 = "geeksforgeeks", s2 = "geeksquiz"
Output: "fioqruz"
Explanation: The characters 'f', 'i', 'o', 'q', 'r', 'u', and 'z' are present in either s1 or s2, but not in both.
```

```
Input: s1 = "characters", s2 = "alphabets"
Output: "bclpr"
Explanation: The characters 'b', 'c', 'l', 'p', and 'r' are present in either s1 or s2, but not in both.
```

```
Input: s1 = "rome", s2 = "more"
Output: ""
Explanation: Both strings contain the same characters, so there are no unique characters. The output is an empty string.
```

 **Constraints:** 
1<= s1.size(), s2.size() <= 105
Both strings contain only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:51:51.610Z  

```java

class Solution {
     String uncommonChars(String s1, String s2) {
         HashSet<Character> hs1 = new HashSet<>();
         HashSet<Character> hs2 = new HashSet<>();

         for (char ch : s1.toCharArray()) hs1.add(ch);
         for (char ch : s2.toCharArray()) hs2.add(ch);

         ArrayList<Character> al = new ArrayList<>();

         for (char c1 : hs1) {
             if (!hs2.contains(c1)) {
                 al.add(c1);
             }
         }
         for (char c2 : hs2) {
             if (!hs1.contains(c2)) {
                 al.add(c2);
             }
         }

         Collections.sort(al);

         StringBuilder sb = new StringBuilder();
         for (char c : al) {
             sb.append(c);
         }

         return sb.toString();
     }
 }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/uncommon-characters4932/1)