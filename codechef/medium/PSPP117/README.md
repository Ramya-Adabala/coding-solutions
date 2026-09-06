# PSPP117

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Iterate over a dictionary

Listen

Iterating over a dictionary in Python allows you to access and process its elements, which are key-value pairs.

#### Iterating Over Keys:

By default - iterating over a dictionary iterates over its keys.

```
my_dict = {"name": "Alice", "age": 30, "location": "New York"}
for key in my_dict:
    print("Key:", key)

```

#### Iterating Over Values:

```
my_dict = {"name": "Alice", "age": 30, "location": "New York"}
for value in my_dict.values():
    print("Value:", value)

```

#### Iterating Over Key-Value Pairs:

To iterate over key-value pairs, you can use the `items()` method.

```
my_dict = {"name": "Alice", "age": 30, "location": "New York"}
for key, value in my_dict.items():
    print("Key:", key, ", Value:", value)

```

### Task

The code in the IDE is incorrect.
Debug the code to get the output as per the sample output given below.

### Sample 1:
Input
Output

```
 
```

```
Key: name, Value: Alice
Key: age, Value: 25
Key: course, Value: Python

```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:16:51.501Z  

```py
# Debug the code below to solve the problem

student_info = {"name": "Alice", "age": 25, "course": "Python"}

for info in student_info:
    print("Key:", info, ", Value:", student_info[info])

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP117)