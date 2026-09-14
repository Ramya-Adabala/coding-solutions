# GSQSAI01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Introduction to date functions

Listen

 **Date functions**  are built-in methods that are included in many database systems to manage date and time-related tasks.

To view the current date and time, we use the function DATETIME().

- DATETIME() returns a date and time in string format by default.
- Example: "2024-11-07 15:30:25".

```
  SELECT DATETIME();

```

### Task

Write a query which outputs the current date and time using DATETIME() function.

 **Note:**  The output will be 5hrs 30min behind the local time and to get the exact local time, use the below query

```
  SELECT DATETIME('now', '+5 hours', '+30 minutes');

```

- here, 'now' is used to get the current date and time.

Code it out in the IDE.

#### Video Explanation:

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T10:25:05.090Z  

```sql
/* Write a query which returns the current date and time. */
select datetime();
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQSAI01)