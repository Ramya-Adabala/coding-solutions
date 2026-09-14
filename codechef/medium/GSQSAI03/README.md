# GSQSAI03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Manipulating date and time

Listen

The functions which are used to manipulate the date and time are given below:

- DATE(): This function returns the date in "YYYY-MM-DD" format. Syntax: SELECT DATE('YYYY-MM-DD',   'modifier1',   'modifier2',...) Modifiers can be in terms of days (or) months (or) years. Examples: DATE(CURRENT_DATE,   '-1 month',   '+1 day'), DATE('2024-05-11',  '-3 years',   '+2 months').

To get the date(YYYY-MM-DD) of 1 year from '2023-11-20', the following syntax is used

```
  SELECT DATE('2023-11-20', '+1 year');

```

- TIME(): This function returns the time in "HH:MM:SS" format. Syntax: SELECT TIME('HH:MM:SS',   'modifier1',   'modifier2',...) Modifiers can be in terms of hours (or) minutes (or) seconds. Examples: TIME(CURRENT_TIME,  '+1 hour',  '-20 minutes'), TIME('23:35:00',  '-5 minutes',  '+30 seconds').

To get the time(HH:MM:SS) of 10 hours from '13:23:45', the following syntax is used

```
  SELECT TIME('13:23:45', '+10 hours');

```

### Task
- Write a query which returns the date(YYYY-MM-DD) of 1 month from '2024-07-04'.
- Write a query which returns the time(HH:MM:SS) of 30 minutes from '20:34:21'.

```
Expected output
2024-08-04
21:04:21

```

Code it out in the IDE.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T10:26:18.509Z  

```sql
/* Solution as follows */

SELECT DATE('2024-07-04','+1 month');
SELECT TIME('20:34:21','+30 minutes');


```

---

[View on CodeChef](https://www.codechef.com/problems/GSQSAI03)