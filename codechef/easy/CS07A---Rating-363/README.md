# CS07A - Rating 363

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Debug this code - Chef gives Party

The code in the IDE is incorrect - debug the code to solve this problem!

Chef wants to give a burger party to all his $N$ friends i.e. he wants to buy  **one**  burger for each of his friends.
The cost of each burger is $X$ rupees while Chef has a total of $K$ rupees.
Determine whether he has enough money to buy a burger for each of his friends or not.

### Input Format
- The first line contains a single integer $T$ - the number of test cases. Then the test cases follow.
- The first and only line of each test case contains the three integers $N$, $X$, and $K$ - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.
### Output Format

For each test case, output '`YES`' if the Chef can give a party to all his $N$ friends. Otherwise, output '`NO`'.

### Sample 1:
Input
Output

```
2
5 10 70
5 10 40

```

```
YES
NO

```

### Explanation:
- Test case $1$: Chef has $5$ friends. The cost of buying a burger for each of them will be $10 \times 5 = 50$ while Chef has $70$ rupees. Therefore, he can buy a burger for all of them.
- Test case $2$: Chef has $5$ friends. The cost of buying a burger for each of them will be $10 \times 5 = 50$ while Chef has $40$ rupees. Therefore, he can not buy a burger for all of them.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T03:06:38.221Z  

```py
#The code below is incorrect. Debug this code to solve the problem

t = int(input())
for i in range(t):
    N,X,K = map(int,input().split())
    if(N*X <= K):
        print("YES")
    else:
        print("NO")
```

---

[View on CodeChef](https://www.codechef.com/problems/CS07A)