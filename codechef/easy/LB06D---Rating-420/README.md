# LB06D - Rating 420

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem (Flip cards) - Solve sub-components

How do we find the minimum number of cards to be flipped?

- One option is to flip $X$ cards
- The other option is to flip $N-X$ cards
- We need to find the minimum of the above

Code out the solution to this sub-problem in the IDE!

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T00:57:21.375Z  

```py
#Solution as follows

N = 10
X = 4
option1 = X
option2 = N-X
print(min(option1, option2))


N = 10
X = 6
option1 = X
option2 = N-X
print(min(option1, option2))
 


```

---

[View on CodeChef](https://www.codechef.com/problems/LB06D)