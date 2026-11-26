# LB02 - Rating 591

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:15:24.933Z  

```py
#Solution as follows
X = 3
Y = 4
Z = 12
if (Z%X == 0) and (Z%Y == 0):
    print('Z is divisible by both X and Y')
elif (Z%X == 0):
    print('Z is divisible only by X')
elif (Z%Y == 0):
    print('Z is divisible only by Y')
else:
    print('Z is divisible by neither X nor Y')

X = 3
Y = 5
Z = 13
if (Z%X == 0) and (Z%Y == 0):
    print('Z is divisible by both X and Y')
elif (Z%X == 0):
    print('Z is divisible only by X')
elif (Z%Y == 0):
    print('Z is divisible only by Y')
else:
    print('Z is divisible by neither X nor Y')
```

---

[View on CodeChef](https://www.codechef.com/problems/LB02)