# CS03A - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T05:14:39.878Z  

```py
# Update the program below to solve the problem

t = int(input())           
for i in range(t):
    X, Y, A = map(int, input().split())
    if(A>=X and A<Y):
        print("YES")
    else:
        print("NO")

```

---

[View on CodeChef](https://www.codechef.com/problems/CS03A)