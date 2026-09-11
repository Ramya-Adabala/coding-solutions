# BM14 - Rating 339

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Max minus Min

The code given in the IDE is incorrect - Try and debug this program!!!

Given 3 integers - $A$, $B$ and $C$ - you need to find the difference between the highest and the lowest of the given 3 integers.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of $3$ integers $A, B, C$.
### Output Format

For each test case, output on a new line the difference between the highest and the lowest of the given 3 integers.

### Sample 1:
Input
Output

```
2
1 3 10
5 6 7

```

```
9
2

```

### Explanation:

 **Test case $1$:**  Here, $max(1, 3, 10) = 10$ and $min(1, 3, 10) = 1$. Thus, the difference is $9$.

 **Test case $2$:**  Here, $max(5, 6, 7) = 7$ and $min(5, 6, 7) = 5$. Thus, the difference is $2$.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:22:38.813Z  

```py
#Try and debug this code to solve the problem!!!

t = int(input())
for i in range(t):
    A, B, C = map(int, input().split())
    maximum = max(A,B,C)
    minimum = min(A,B,C)
    D = maximum - minimum
    print(D)
    
```

---

[View on CodeChef](https://www.codechef.com/problems/BM14)