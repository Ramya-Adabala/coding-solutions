# PSPP115

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Modifying a dictionary

Listen

Adding items to a dictionary - To add a new key-value pair to a dictionary, you simply assign a value to a new key.

```
my_dict = {"name": "Alice", "age": 30}
my_dict["location"] = "New York"

```

Modifying Items in a Dictionary - To modify an existing value associated with a key in a dictionary, you can simply reassign a new value to that key.

```
my_dict = {"name": "Alice", "age": 30}
my_dict["age"] = 31  # Update the value for the key "age"

```

### Task

A dictionary has been defined for you in the IDE. You need to do the following

- Add a new key as "location" and its value as "New York"
- Update the "age" as 26
- Print the updated dictionary to the console

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:12:47.648Z  

```py
# Update the code below to get the necessart output

student_info = {"name": "Alice", "age": 25, "course": "Python"}

# Adding a new key-value pair
student_info["location"]="New York";

# Modifying an existing value
student_info["age"]=26;

print("Updated Student Info:", student_info)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP115)