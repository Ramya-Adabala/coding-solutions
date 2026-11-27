# LB04A - Rating 520

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem (MOVIE2X) - Solve the complete problem

Chef started watching a movie that runs for a total of $X$ minutes.
Chef has decided to watch the first $Y$ minutes ($Y$ is  **even**) of the movie at  **twice**  the usual speed.
How long will Chef spend watching the movie in  **total** ?

- Input format - The first line contains two space separated integers $X, Y$
- Output the total number of minutes that Chef spends in watching the moving
### Subtasks

 **Subtask #1 (100 points):**  original constraints

### Sample 1:
Input
Output

```
100 20
```

```
90
```

### Explanation:

For the first $Y = 20$ minutes, Chef watches at twice the usual speed, so the total amount of time spent to watch this portion of the movie is $\frac{Y}{2} = 10$ minutes.

For the remaining $X - Y = 80$ minutes, Chef watches at the usual speed, so it takes him $80$ minutes to watch the remaining portion of the movie.

In total, Chef spends $10 + 80 = 90$ minutes watching the entire movie.

### Sample 2:
Input
Output

```
50 24
```

```
38
```

### Explanation:

For the first $Y = 24$ minutes, Chef watches at twice the usual speed, so the total amount of time spent to watch this portion of the movie is $\frac{Y}{2} = 12$ minutes.

For the remaining $X - Y = 26$ minutes, Chef watches at the usual speed, so it takes him $26$ minutes to watch the remaining portion of the movie.

In total, Chef spends $12 + 26 = 38$ minutes watching the entire movie.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T00:23:59.453Z  

```py
# Solution as follows
# Remember - there is no t in this problem

X, Y = map(int,input().split())

#declare a variable watchtime to store the solution
watchtime = (X - Y) + (Y//2)     

print(watchtime)
```

---

[View on CodeChef](https://www.codechef.com/problems/LB04A)