# PSPP82C - Rating 746

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Coding problem-2

Listen

Given $n$ ($n$ is  **even**), determine the number of  **black cells**  in an $n \times n$ chessboard.
Update the function given in the IDE to solve the problem.

### Input Format

The only line of the input contains a single integer $n$.

### Output Format

Output the number of black cells in an $n \times n$ chessboard.

### Constraints
- $2 \leq n \leq 100$
- $n$ is even
### Sample 1:
Input
Output

```
8
```

```
32
```

### Explanation:

There are $32$ black cells and $32$ white cells in an $8 \times 8$ chessboard. So the answer is $32$.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:05:19.480Z  

```py
# Update the code below to solve the problem

def square(t):
    value1=t*t
    return value1


    
def half(i):
    value2=i//2
    return value2
 
 
 
n = int(input())
result1 = square(n)
result2 = half(result1)
print(result2)
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP82C)