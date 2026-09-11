# BM08D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice problem - Modulo function

Chef has recently started playing chess.
He completes a game of chess in 30 minutes.
Chef has a total of $N$ minutes of available time

- He will utilise the maximum possible time to play
- He will not plan incomplete games - if there is insufficient time remaining to play a game, he will not play the game

How many complete games with Chef be able to play and how much spare time will remain?
Go ahead and code out the solution in the IDE.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of the integer $N$
### Output Format

For each test case, output on a new line $2$ space separated integers

- Total games played by Chef
- Total spare time in minutes
### Sample 1:
Input
Output

```
2
100
90
```

```
3 10
3 0
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:20:44.274Z  

```py
# Update the code below to solve the problem

t = int(input())
for i in range(t):
    N = int(input())
    total_games = N//30
    remaining_time = N %30
    print(total_games, remaining_time)
```

---

[View on CodeChef](https://www.codechef.com/problems/BM08D)