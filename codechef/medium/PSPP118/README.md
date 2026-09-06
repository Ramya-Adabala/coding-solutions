# PSPP118

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Key existence in a dictionary

Listen

It's important to determine whether a particular key exists before attempting to access its associated value to avoid potential errors.

- in: Can be used to check if a specific key is present in a dictionary.

```
my_dict = {"name": "Alice", "age": 30}
print("name" in my_dict)  # Output: True
print("location" in my_dict)  # Output: False

```

- get(): Allows you to retrieve the value for a given key if it exists.

```
my_dict = {"name": "Alice", "age": 30}
print(my_dict.get("name"))  # Output: Alice
print(my_dict.get("location"))  # Output: None

```

Click on 'Submit' to view the output of the code in the IDE.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:17:11.936Z  

```py
# Click on submit to view the result

student_info = {"name": "Alice", "age": 25, "course": "Python"}

# Using the 'in' operator to check for key existence
print("name" in student_info)  
print("location" in student_info)  

# Using the 'get()' method to check for key existence
print(student_info.get("age"))  
print(student_info.get("location"))  
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP118)