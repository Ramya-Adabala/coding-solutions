# PSPP111

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### List as part of a tuple

Listen

A tuple can hold elements of various types, including lists, which makes tuples versatile for storing a mix of different data structures.

Consider the syntax below

```
my_list = [1, 2, 3]
my_tuple = ("Alice", 30, my_list)

print("Tuple:", my_tuple)   # Output - Tuple: ('Alice', 30, [1, 2, 3])

```

### Task

Consider the tuple defined as follows

```
student = ("Alice", 20, ["Math", "Science", "English"])

```

What will be the output for `print(student[2])`?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:08:11.208Z  

```cpp
# Click on 'Submit' to view the result

data_tuple = (10, 3.14, 'Hello, World!', True)

for element in data_tuple:
    print("Element:", element, ", Type:", type(element))

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP111)