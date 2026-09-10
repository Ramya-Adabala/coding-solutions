# GSQ41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T01:49:19.065Z  

```sql
/* Solution as follows */

SELECT count(*) as 'count_sales'
FROM employee
where Department='Sales';

SELECT MAX(Hourly_Pay) as 'ops_max_pay'
FROM employee
where Department='Operations';

SELECT MIN(Hourly_Pay) as 'ops_min_pay'
FROM employee
where Department='Operations';
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ41)