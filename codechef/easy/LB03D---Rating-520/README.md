# LB03D - Rating 520

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem 3 (High Accuracy) - Solve sub-components

How do we find the number of questions incorrectly solved?

- If $X$ is divisible by 3, then minimum number of questions incorrect is $0$
- If $X+1$ is divisible by 3, then minimum number of questions incorrect is $1$
- If $X+2$ is divisible by 3, then minimum number of questions incorrect is $2$

Go ahead and code out this sub-problem in the IDE!

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:16:23.012Z  

```py
#Solution as follows

X = 30
if X%3 == 0:
    print('Number of questions incorrectly solved is 0')
elif (X+1)%3 == 0:
    print('Number of questions incorrectly solved is 1')
else:
    print('Number of questions incorrectly solved is 2')
    
X = 34
if X%3 == 0:
    print('Number of questions incorrectly solved is 0')
elif (X+1)%3 == 0:
    print('Number of questions incorrectly solved is 1')
else:
    print('Number of questions incorrectly solved is 2')

```

---

[View on CodeChef](https://www.codechef.com/problems/LB03D)