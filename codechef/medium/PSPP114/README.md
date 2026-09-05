# PSPP114

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Dictionary

Listen

A dictionary is an unordered collection of data in a  **key-value**  pair format.
Each value in a dictionary is accessed using a unique key.

#### Creating a dictionary

```
my_dict = {"key1": "value1", "key2": "value2", "key3": "value3"}

```

- Dictionaries are created using curly braces {}.
- Key-value pairs are separated by colons : and elements are separated by commas.
#### Accessing values

Values in a dictionary are accessed using keys.

```
my_dict = {"name": "Alice", "age": 30}
print(my_dict["name"])  # Access the value for the key "name"

```

#### Dictionary characteristics
- Order: Unlike sequences (e.g., lists, tuples), dictionaries are not ordered till python versons older than 3.7. After v3.7, they are ordered.
- Mutable: Dictionaries can be modified (items can be added, removed, or modified).
- Unique: Keys in a dictionary must be unique.

Check out the implementation in the IDE

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:10:01.241Z  

```py
# click on submit to view the result

my_dict = {"name": "Alice", "age": 30}
print(my_dict["age"])  # Access the value for the key "age"

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP114)