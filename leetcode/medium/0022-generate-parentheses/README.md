# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.5 MB (beats 71.69%)  
**Submitted:** 2026-10-02T05:38:15.586Z  

```java
class Solution { 
    public List<String> generateParenthesis(int n) { 
        List<String> ans = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        dfs(n, n, cur, ans);
        return ans;
    }
    private void dfs(int open, int close, StringBuilder cur, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(cur.toString());
            return;
        }
        if (open > 0) {
            cur.append('(');
            dfs(open - 1, close, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close > open) {
            cur.append(')');
            dfs(open, close - 1, cur, ans);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)