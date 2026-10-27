# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 10.28%)  
**Memory:** 42.5 MB (beats 97.22%)  
**Submitted:** 2026-10-27T00:51:57.291Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length(); int m=jewels.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:stones.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char j:jewels.toCharArray()){
            count+=hm.getOrDefault(j,0);
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)