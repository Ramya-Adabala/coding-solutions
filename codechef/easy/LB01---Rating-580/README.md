# LB01 - Rating 580

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem (Make Avg) - Solve the complete problem

You are given 2 integers - $A$ and $C$.
You need to find if there exists any $integer$ $B$ which meets the following condition

- $B$ must be an integer
- $B$ is the average of $A$ and $C$.
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two space-separated integers $A$ and $C$, the given integers.
### Output Format

For each test case, output $-1$ if there exists no integer $B$ such that $A, B,$ and $C$ are in arithmetic progression. Else, output the value of $B$.

### Sample 1:
Input
Output

```
3
3 5
6 6
2 7
```

```
4
6
-1

```

### Explanation:

 **Test case $1$:**  Considering $B = 4$, $B$ is the average of $3$ and $5$.
 **Test case $2$:**  Considering $B = 6$, $B$ is the average of $6$ and $6$.
 **Test case $3$:**  There exists no integer $B$ such that $B$ can be the average of $2$ and $7$.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T04:14:24.618Z  

```py
# Solution as follows

t = int(input())            
for i in range(t):          
    A, C = map(int, input().split())
    
    #Borrow the solution template from the sub-components
    if A%2 == 0 and C%2 == 0:
        B = (A + C)//2
        print(B)
    elif A%2 != 0 and C%2 != 0:
        B = (A + C)//2
        print(B)
    else:
        print(-1)
```

---

[View on CodeChef](https://www.codechef.com/problems/LB01)