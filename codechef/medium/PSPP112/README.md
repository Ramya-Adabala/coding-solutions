# PSPP112

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tuple unpacking

Listen

Tuple unpacking, also known as tuple destructuring, is a feature in Python that allows you to assign the elements of a tuple to individual variables in a single assignment statement.
This makes it easy to extract and work with the individual elements of a tuple.

Example

```
my_tuple = (1, 'hello', 3.14)

# Unpack the tuple into separate variables
a, b, c = my_tuple

# Print the unpacked variables
print("a:", a)  # Output: a: 1
print("b:", b)  # Output: b: hello
print("c:", c)  # Output: c: 3.14

```

### Task

We have defined a tuple for you in the IDE.
Update the code to get the output as defined in the sample output below.

### Sample 1:
Input
Output

```
 
```

```
Bob
English
20
Z

```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:08:46.152Z  

```py
student = (["Alice", "Bob"], ["Math", "Science", "English"], 20, 'XYZ')

# Update the code below this line
list_1, list_2, num, string = student

# print the relevant components
print(list_1[1])
print(list_2[2])
print(num)
print(string[2])
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP112)