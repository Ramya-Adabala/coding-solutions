# CS11A - Rating 424

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Pass the Exam

The code in the IDE is incorrect - debug the code to solve this problem!

Chef appeared for an exam consisting of $3$ sections. Each section is worth $100$ marks.
Chef scored $A$ marks in Section $1$, $B$ marks in section $2$, and $C$ marks in section $3$.
Chef passes the exam if both of the following conditions satisfy:

- Total score of Chef is $\geq 100$;
- Score of each section $\geq 10$.

Determine whether Chef passes the exam or not.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line containing $3$ space-separated numbers $A, B, C$ - Chef's score in each of the sections.
### Output Format

For each test case, output '`PASS`' if Chef passes the exam, '`FAIL`' otherwise.

### Sample 1:
Input
Output

```
2
9 100 100
30 40 50

```

```
FAIL
PASS

```

### Explanation:

 **Test Case $1$:**  Although Chef's total score is $209 \geq 100$, still Chef fails the exam since his score in section $1$ is $\lt 10$.

 **Test Case $2$:**  Chef cleared each section's cutoff as well his total score $= 120 \geq 100$.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T05:20:43.063Z  

```py
# The code below is incorrect. Debug this code to solve this problem

t=int(input())
for i in range(t):
    A, B, C = map(int,input().split())
    total_score = A + B + C
    minimum_score = min(A,B,C)
    if total_score>=100 and minimum_score>=10:
        print('PASS')
    else:
        print('FAIL')
```

---

[View on CodeChef](https://www.codechef.com/problems/CS11A)