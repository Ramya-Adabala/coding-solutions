# TCKTFINE - Rating 366

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T03:25:47.074Z  

```py
# Read the number of test cases
t = int(input())

for _ in range(t):
    # Read Alice's score (a) and Bob's score (b)
    a, b = map(int, input().split())
    
    
    print(min(7 - a, 7 - b))
```

---

[View on CodeChef](https://www.codechef.com/problems/TCKTFINE)