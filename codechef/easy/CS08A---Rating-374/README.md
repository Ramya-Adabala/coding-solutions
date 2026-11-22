# CS08A - Rating 374

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Car Trip

The code in the IDE is incorrect - debug the code to solve this problem!

Chef rented a car for a day. Usually, the cost to rent the car is Rs $10$ per km.
However, since Chef has booked the car for the whole day, he needs to pay for  **at least**  $300$ kms even if the car runs less than $300$ kms.
If the car ran $X$ kms, determine the cost Chef needs to pay.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single integer $X$ - denoting the number of kms Chef travelled.
### Output Format

For each test case, output the cost Chef needs to pay.

### Sample 1:
Input
Output

```
2
800
3

```

```
8000
3000

```

### Explanation:

 **Test case $1$:**  The car runs for $800$ kms. Thus, he needs to pay $800\cdot 10 = 8000$ rupees.

 **Test case $2$:**  The car runs for $3$ kms. However, since Chef booked the car for whole day, he needs to pay for at least $300$ kms. Thus, he needs to pay $300\cdot 10 = 3000$ rupees.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T03:07:30.953Z  

```py
# The code below is incorrect. Debug this code to solve the problem

t=int(input())
for j in range(t):
    X=int(input())
    if X<=300:               
        print(3000)
    else:
        print(X*10)
    

```

---

[View on CodeChef](https://www.codechef.com/problems/CS08A)