# PSPP116

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Removing items from a dictionary

Listen

Removing items from a dictionary involves deleting key-value pairs.
Dictionaries provide different methods to remove elements based on keys.

- del: Allows you to remove a specific key-value pair from the dictionary.

```
my_dict = {"name": "Alice", "age": 30}
del my_dict["age"]  # Remove the key "age" and its corresponding value

```

- pop(): Removes a specified key and returns the corresponding value.

```
my_dict = {"name": "Alice", "age": 30}
removed_age = my_dict.pop("age")  # Remove the key "age" and retrieve its value

```

- clear(): Removes all key-value pairs from the dictionary, leaving it empty.

```
my_dict = {"name": "Alice", "age": 30}
my_dict.clear()  # Clear all key-value pairs

```

Review the code on IDE and click on 'Submit' to see the result.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:13:12.949Z  

```py
student_info = {"name": "Alice", "age": 25, "course": "Python"}

# Using del to remove a specific key-value pair
del student_info["course"]
print(student_info)

# Using pop() to remove and retrieve a specific key-value pair
removed_age = student_info.pop("age")

# Using clear() to clear all key-value pairs
student_info.clear()

print("Updated Student Info:", student_info)
print("Removed Age:", removed_age)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP116)