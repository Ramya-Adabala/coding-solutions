# GSQ59

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T10:10:59.298Z  

```sql
/* Write a query to output the following
- Department and average payout on a single line
- Where total payout of the department is more than 40. */
select department, avg(payout) as avg_payout from employee
group by department having sum(payout) >40;

```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ59)