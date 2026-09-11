# BM08B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Abs() - Absolute function

Let us check the $abs$ function in a bit more detail

### Task

There are multiple test cases denoted by the integer $T$.
You are given 2 integers - $A$ and $B$.
For each test case, you need to output the following 4 space separated integers  **on a single line** 

- $A - B$
- $B - A$
- $abs(A - B)$
- $abs(B - A)$

What do you observe in the results?
Go ahead and code out the solution in the IDE.

### Sample 1:
Input
Output

```
3
10 5
5 10
3 11
```

```
5 -5 5 5
-5 5 5 5
-8 8 8 8
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:20:17.147Z  

```py
# Update the '_' in the code below to solve this problem

t = int(input())
for i in range(t):
    A, B = map(int, input().split())
    print((A - B), (B - A), abs(A - B), abs(B- A))
    
```

---

[View on CodeChef](https://www.codechef.com/problems/BM08B)