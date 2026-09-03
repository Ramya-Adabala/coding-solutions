# PSPP82

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calling a function within function

Listen

Functions can also call other functions in Python.

Check the sample code given below

```
# Function to calculate the square of a number
def square(num):
    return num * num

def square_and_double(num):
    # Call the square function to calculate square
    squared = square(num)

    # Double the squared result
    return 2 * squared

# Call the square_and_double function with the argument 3
result = square_and_double(3)

print("Result:", result)     # Output will be 'Result: 18'

```

### Task
- The editor contains an incomplete code.
- Update the function greet_and_capitalize by calling the above defined functions inside it to get the expected output.

 **Expected output** 

```
Final Result: HELLO, ALICE!

```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:29:54.073Z  

```py
def greet(name):
    return f"Hello, {name}!"

def capitalize(text):
    return text.upper()

# Solution as follows
def greet_and_capitalize(name):
    greeting = greet(name)
    return capitalize(greeting)

# Call the functions
name = "Alice"
final_result = greet_and_capitalize(name)

# Display the results
print("Final Result:", final_result)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP82)