# GS13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number mirror - Negative integer

Listen

Let us now solve some programming problems. Note that

- In the IDE - # - comments will give you hints about what you need to do
- The Solution tab also has # - comments which give you helpful information
### Task

Write a program in the IDE which does the following

- Accepts the count of test cases - $t$ - in the 1st line The only line of each test case consists of an integer $N$
- You need to generate the following output - Change the sign of $N$. That is, if the input is $4$, output $-4$. If the input is $-5$, output $5$.
### Sample 1:
Input
Output

```
5
1
2
3
-4
-5
```

```
-1
-2
-3
4
5
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T14:15:56.935Z  

```py
# Solution as follows

# accept the count of test cases given in the the 1st line
t = int(input())        

# run a loop to accept 't' inputs
for i in range(t):      
    n = int(input())    
    
    # output the negative integer - i.e. (-n)
    print(-n)
```

---

[View on CodeChef](https://www.codechef.com/problems/GS13)