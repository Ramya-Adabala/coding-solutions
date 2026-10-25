# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 12.94%)  
**Memory:** 42 MB (beats 97.53%)  
**Submitted:** 2026-10-25T17:28:01.448Z  

```java
class Solution {
    public int reverse(int x) {
        int rem=0;
        double rev=0;
        while(x!=0){
             rem=x%10;
             rev=rev*10+rem;
             x=x/10;
        }
        if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE){
            int res=(int) rev;
            return res;
        }
        return 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)