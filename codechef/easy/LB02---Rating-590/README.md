# LB02 - Rating 590

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem(Farm animals) - Solve the complete problem

In Chefland, each chicken has $X$ legs and each duck has $Y$ legs.
Chef's farm can have  **exactly one type**  of bird.
Given that the birds on the farm have a total of $Z$ legs:

- Print CHICKEN, if the farm can have only chickens but not ducks.
- Print DUCK, if the farm can have only ducks but not chickens.
- Print ANY, if the farm can have either chickens or ducks.
- Print NONE, if the farm can have neither chickens nor ducks.

Input format

- The first line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case consists of a single line of input, containing three space-separated integers $X, Y, Z$.
### Sample 1:
Input
Output

```
3
2 3 5
2 2 2
3 4 6
```

```
NONE
ANY
CHICKEN
```

### Explanation:

 **Test case $1$:**  There are $5$ legs on the farm. Each chicken has $2$ legs and each duck has $3$ legs. Thus, the farm can have neither chickens nor ducks.

 **Test case $2$:**  There are $2$ legs on the farm. Each chicken has $2$ legs and each duck has $2$ legs. Thus, the farm can have any bird among chicken and duck.

 **Test case $3$:**  There are $6$ legs on the farm. Each chicken has $3$ legs and each duck has $4$ legs. Thus, the farm can have chicken only.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:15:46.894Z  

```py
# Solution as follows

t = int(input())            
for i in range(t):          
    X, Y, Z = map(int, input().split())
    
    #Borrow the template from our sub-component
    if (Z%X == 0) and (Z%Y == 0):   
        print('ANY')
    elif (Z%X == 0):
        print('CHICKEN')
    elif (Z%Y == 0):
        print('DUCK')
    else:
        print('NONE')

```

---

[View on CodeChef](https://www.codechef.com/problems/LB02)