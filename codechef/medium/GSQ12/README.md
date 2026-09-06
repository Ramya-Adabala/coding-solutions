# GSQ12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T04:56:13.800Z  

```sql
/* Write a query to do the following
- Set hourly_pay to 150 for HR employees
- Output the entire table
*/
update employee set hourly_pay=150 where department='Hr';
select *from employee;
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ12)