# PSPP82C - Rating 284

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:30:37.686Z  

```py
# Solution as follows

def users_with_rating(only_viewed, attempted, visited):
    return (visited - only_viewed)
    
def users_with_high_rating(only_viewed, attempted, visited):
    return(visited - only_viewed - attempted)
    

N, A, B = map(int, input().split())
result_1 = users_with_rating(A, B, N)
result_2 = users_with_high_rating(A, B, N)
print(result_1, result_2)
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP82C)