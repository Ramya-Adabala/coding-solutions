# GSQSAI05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Modifiers used

Listen

Date functions support several useful modifiers. A few of these frequent date modifiers are described below:

```
┌───────────────────────┬──────────────────────┬──────────────────────────────────────────┐
│ Modifiers             │ Format               │  Example                                 │
├───────────────────────┼──────────────────────┼──────────────────────────────────────────┤
│ Adds/subtracts days   │ +d days,-d days      │  date(current_date,'+1 month','-1 day')  │
│ Adds/subtracts months │ +m months, -m months │  date('2024-04-03','+3 month','+2 day')  │
│ Adds/subtracts years  │ +Y years, -Y years   │  date(current_date,'+2 years')           │
│ First day of the month│ 'start of month'     │  date('2004-03-04', 'start of month')    |          
│ First day of the year │ 'start of year'      │  date(CURRENT_DATE, 'start of year')     │
│ Next W(0-6)th weekday │ 'weekday W'          │  date('2024-09-23', 'Weekday 0')         │  
└───────────────────────┴──────────────────────┴──────────────────────────────────────────┘   

```

- To get the first day of this month, the following syntax is used

```
  SELECT DATE(CURRENT_DATE, 'start of month');

```

- To get the last day of this month, the following syntax is used

```
  SELECT DATE(CURRENT_DATE, 'start of month', '+1 month', '-1 day'); 

```

### Task
- Write a query to get the last day of the month from the date '2024-06-23'.
- Write a query to get the date of 15 days from '2024-03-22'.

```
Expected output
2024-06-30
2024-04-06

```

Code it out in the IDE.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T04:29:38.994Z  

```sql
/* Solution as follows */

SELECT DATE('2024-06-23','start of month','+1 month','-1 day');
SELECT DATE('2024-03-22','+15 days');


```

---

[View on CodeChef](https://www.codechef.com/problems/GSQSAI05)