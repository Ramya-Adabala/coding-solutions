# generate-all-possible-parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T05:40:15.733Z  

```java
class Solution {

    public void helper(int n,int l,int r, String s, ArrayList<String> list){

        if(r==n){

            list.add(s);

            return;

        }

        if(l<n) helper(n,l+1,r,s+"(",list);

        if(r<l) helper(n,l,r+1,s+")",list);

    }   

    public ArrayList<String> generateParentheses(int n) {



        ArrayList<String> list=new ArrayList<>();                 
        helper(n/2,0,0,"",list);

        return list;

    }}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)