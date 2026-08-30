# PSPP79A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Return values

Listen

Functions in Python can serve two primary purposes when it comes to providing information to the caller: they can either return a value or print an output.

#### Returning Values from Functions:

When a function returns a value, it's providing a piece of data back to the caller.
This data can be used for further processing, assignment to variables, or any other purpose within the program. The `return` statement is used to send a value back to the caller.
Check the sample below

```
def calculate_square(num):
    square_result = num * num
    return square_result

# Calling the function and capturing the return value
result = calculate_square(5)

print("Square of 5:", result)  # Output: Square of 5: 25

```

#### Printing Output from Functions:

A function can also directly print output to the console using print statements.
However, this doesn't provide any data back to the caller in a way that can be used elsewhere in the program.
The primary purpose here is to display information, not to provide data for further processing.
Check the example below which gives the same output as the code above

```
def print_square(num):
    square_result = num * num
    print("Square of", num, "is:", square_result)

# Calling the function
print_square(5)  # Output: Square of 5 is: 25

```

### Task

Update the function given in the IDE to output the following to the IDE by printing from inside the function.

- $A^2 + 2 *A* B + B^2$ (* means multiplication)
- $A + B$

Check sample output below.

### Sample 1:
Input
Output

```
3 5
2 7
4 1
```

```
64
8
81
9
25
5
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T06:00:14.316Z  

```py
def compute_value(a, b):
    # Solution as follows
    c = a*a + 2*a*b + b*b
    d = a + b
    print(c)
    print(d)

t = 3
for _ in range(t):
    A, B = map(int, input().split())
    compute_value(A, B)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP79A)