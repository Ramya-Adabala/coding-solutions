# PSPP119

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Nested dictionary

Listen

A nested dictionary is a dictionary that contains another dictionary (or dictionaries) as a value for one or more of its keys. This means that the values of a dictionary can themselves be dictionaries.

```
nested_dict = {
    "person1": {"name": "Alice", "age": 30},
    "person2": {"name": "Bob", "age": 25}
}

```

To access values in a nested dictionary, you use multiple square brackets to access the value of a specific key at each level.

```
print(nested_dict["person1"]["name"])  # Output: Alice
print(nested_dict["person2"]["age"])   # Output: 25

```

You can modify values in a nested dictionary by accessing the specific keys and assigning new values.

```
nested_dict["person1"]["age"] = 35
nested_dict["person2"]["location"] = "New York"

```

### Task

We have defined a nested dictionary for you in the IDE.
Update the code to get the output as per the sample output given below.

### Sample 1:
Input
Output

```
 
```

```
{'person1': {'name': 'Alice', 'age': 35}, 'person2': {'name': 'Bob', 'age': 25, 'location': 'New York'}, 'person3': {'name': 'Charlie', 'age': 28}}

```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:17:38.365Z  

```py
# Solution as follows

nested_dict = {
    "person1": {"name": "Alice", "age": 30},
    "person2": {"name": "Bob", "age": 25}
}

nested_dict["person1"]["age"] = 35
nested_dict["person2"]["location"] = "New York"

nested_dict["person3"] = {"name": "Charlie", "age": 28}

print(nested_dict)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP119)