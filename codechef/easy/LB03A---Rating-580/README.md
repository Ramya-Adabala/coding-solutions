# LB03A - Rating 580

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:15:48.829Z  

```py
# Solution as follows

t = int(input())            
for i in range(t):          
    X, Y, Z = map(int, input().split())
    
    #Borrow the template from our sub-component
    if (Z%X == 0) and (Z%Y == 0):   
        print('ANY')
    elif (Z%X == 0):
        print('CHICKEN')
    elif (Z%Y == 0):
        print('DUCK')
    else:
        print('NONE')

```

---

[View on CodeChef](https://www.codechef.com/problems/LB03A)