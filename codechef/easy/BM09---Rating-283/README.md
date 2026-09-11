# BM09 - Rating 283

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Capacity

You have $N$ cars that can seat $5$ people each and $M$ cars that can seat $7$ people each.
Determine the maximum number of people that can travel together in these cars.

 **Hint** 

- Calculate the total capacity of 5 seater cars and 7 seater cars. Then add the total capacity.
### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- The first and only line of each test case contains two space-separated integers $N$ and $M$ — the number of $5$-seaters and $7$-seaters, respectively.
### Output Format

For each test case, output on a new line the maximum number of people that can travel together.

### Sample 1:
Input
Output

```
2
4 8
2 13

```

```
76
101

```

### Explanation:

 **Test case $1$:**  There are $4$ cars that seat $5$ each and $8$ cars that seat $7$ each. So, $4\times 5 + 8\times 7 = 76$ people can travel together.

 **Test case $2$:**  There are $2$ cars that seat $5$ each and $13$ cars that seat $7$ each. So, $2\times 5 + 13\times 7 = 101$ people can travel together.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:21:51.742Z  

```py
# Update the '_' in the code below to solve the problem

t = int(input())                
for i in range(t):              
    #Accept 2 integers inputs.
    N, M = map(int,input().split())         
    #Declare a new variable to store the 5 seater capacity
    five_seat_capacity = N*5   
    #Declare a new variable to store the 7 seater capacity
    seven_seat_capacity = M*7   
    #Print the desired output for each test case
    print(five_seat_capacity+seven_seat_capacity)                  
```

---

[View on CodeChef](https://www.codechef.com/problems/BM09)