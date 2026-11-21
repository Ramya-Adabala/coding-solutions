# CS06A - Rating 520

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Apples and Oranges

Bob has $X$ rupees and goes to a market.
The cost of apples is Rs. $A$ per kg and the cost of oranges is Rs. $B$ per kg.
Determine whether he can buy at least $1$ kg each of apples and oranges.

 **Note**  - this problem does not have multiple test cases.  **t**  is not a part of the input

### Input Format
- The first line of input will contain an integer $X$, the amount of money Bob has.
- The second line of input contains two space-separated integers $A$ and $B$, the cost per kg of apples and oranges respectively.
### Output Format

Print a single line containing '`Yes`' if Bob can buy the fruits and '`No`' otherwise.

### Sample 1:
Input
Output

```
14 
2 2
```

```
Yes
```

### Explanation:

The cost of buying $1$ kg each of apple and orange is $2+2 = 4$. Since Bob has more than $4$ rupees, the answer will be `Yes`.

### Sample 2:
Input
Output

```
5
3 2

```

```
Yes
```

### Explanation:

The cost of buying $1$ kg each of apple and orange is $3+2 = 5$. Since Bob has exactly $5$ rupees, the answer will be `Yes`.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T00:06:12.953Z  

```py
#Update the code below to solve this problem

#Note this line has been commented out there is no 't'
#t = int(input())   

X = int(input())
A,B = map(int, input().split())
if(A+B)<=X:
    print("Yes")
else:
    print("No")

```

---

[View on CodeChef](https://www.codechef.com/problems/CS06A)