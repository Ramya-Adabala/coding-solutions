# CS05A - Rating 362

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Alice and Marks

Alice has scored $X$ marks in her test and Bob has scored $Y$ marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score.
Determine whether she is happy or not.

 **Note**  - this problem does not have multiple test cases.  **t**  is not a part of the input

### Input Format
- The first and only line of input contains two space-separated integers $X, Y$ — the marks of Alice and Bob respectively.
### Output Format

For each testcase, print '`Yes`' if Alice is happy and '`No`' if she is not, according to the problem statement.

### Sample 1:
Input
Output

```
2 1
```

```
Yes
```

### Explanation:

Alice has scored $X = 2$ marks whereas Bob has scored $Y = 1$ mark. As Alice has scored twice as much as Bob (i.e. $X \geq 2Y$), the answer is `Yes`.

### Sample 2:
Input
Output

```
1 2
```

```
No
```

### Explanation:

Alice has scored $X = 1$ mark whereas Bob has scored $Y = 2$ marks. As Alice has  **not**  scored twice as much as Bob (i.e. $X \lt 2Y$), the answer is `No`.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T00:08:53.596Z  

```py
# Solution as follows

#Note this line has been commented out there is no 't' in this problem
#t = int(input())           

#Accept 2 integers as input
X,Y = map(int, input().split())   
#Primary condition 1 as per the problem statement 
if X >= 2*Y:                    
    print('Yes')
else:
    print('No')


```

---

[View on CodeChef](https://www.codechef.com/problems/CS05A)