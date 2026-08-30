# PSPP78

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Functions continued

Listen

In the previous task you had to compute the square and cube of each number.
This can get very long if you have more numbers.

Functions allow you to break down a complex program into smaller, manageable modules.
Each function can represent a specific task or functionality.
Once defined, functions can be reused in different parts of the program or even in different programs, promoting code reuse and saving development time.

Look at the code in the IDE for the previous problem which highlights the implementation of function.
Review the code and click on `Submit` to proceed.

In the next lesson we will learn about the syntax of functions.

### Sample 1:
Input
Output

```
 
```

```
4
8
9
27
16
64
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T05:59:52.122Z  

```py
def calculate_square_and_cube(number):
    square = number ** 2
    cube = number ** 3
    print(square)
    print(cube)

# Using the function for numbers 2, 3, and 4
calculate_square_and_cube(2)
calculate_square_and_cube(3)
calculate_square_and_cube(4)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP78)