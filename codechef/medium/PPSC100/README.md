# PPSC100

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Another Pattern Problem

Listen

Go ahead and practice another problem.

Given an integer $N$ - print a number pattern of height $N$.
Check the sample output given below.

### Sample 1:
Input
Output

```
5
```

```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T05:59:13.466Z  

```py
# cook your dish here

n = int(input())

i = 1
while i <= n:
    j = 1
    while j <= i:
        print(j, end=' ')
        j = j + 1
    print()
    i = i + 1
```

---

[View on CodeChef](https://www.codechef.com/problems/PPSC100)