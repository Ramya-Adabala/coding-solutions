# CS01AC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical operators

Let us try an example with multiple " **and** " and " **or** " statements can be clubbed into a single  **if / else**  condition.

### Task

You are given 2 integers $A$ and $B$.
You need to compute and output the following for each test case

- If $A$ is not equal to $B$ and $A$ and $B$ are both odd - then output 'A and B are different and are odd'
- Else if $A$ is not equal to $B$ and $A$ and $B$ are both even - then output 'A and B are different and are even'
- For every other value of $A$ and $B$, output 'Doesn't matter'

Solve this problem in the IDE.

### Sample 1:
Input
Output

```
4
-9 5
3 3
-10 10
2 1
```

```
A and B are different and are odd
Doesn't matter
A and B are different and are even
Doesn't matter
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T05:17:49.571Z  

```py
# Solution as follows

t = int(input())
for i in range(t):
    A, B = map(int, input().split())
    if A != B and (A%2 != 0 and B%2 != 0):
        print("A and B are different and are odd")
    elif A != B and (A%2 == 0 and B%2 == 0):
        print("A and B are different and are even")
    else:
        print("Doesn't matter")
```

---

[View on CodeChef](https://www.codechef.com/problems/CS01AC)