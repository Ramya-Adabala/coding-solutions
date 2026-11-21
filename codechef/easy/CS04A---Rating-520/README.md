# CS04A - Rating 520

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Interior Design

Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.

- Style 1: tiling the floor will cost $X_1$ rupees and painting the walls will cost $Y_1$ rupees.
- Style 2: tiling the floor will cost $X_2$ rupees and painting the walls will cost $Y_2$ rupees.

Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input, containing $4$ space-separated integers $X_1, Y_1, X_2, Y_2$ as described in the statement.
### Output Format

For each test case, output on a new line the amount Chef will pay for interior design.

### Sample 1:
Input
Output

```
2
10 20 9 25
10 20 9 20

```

```
30
29

```

### Explanation:

 **Test case $1$:**  The first style costs $10 + 20 = 30$ rupees, and the second costs $9 + 25 = 34$ rupees. The first is cheaper, so Chef will pay $30$ rupees.

 **Test case $2$:**  The first style costs $10 + 20 = 30$ rupees, and the second costs $9 + 20 = 29$ rupees. The second is cheaper, so Chef will pay $29$ rupees.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T00:08:10.923Z  

```py
# Update the program below to solve the problem

t = int(input())           
for i in range(t):
    #Accept 4 integers as input
    X1,Y1,X2,Y2 = map(int, input().split()) 
    if (X1+Y1)<(X2+Y2):
        print(X1+Y1)
    else:
        print(X2+Y2)
```

---

[View on CodeChef](https://www.codechef.com/problems/CS04A)