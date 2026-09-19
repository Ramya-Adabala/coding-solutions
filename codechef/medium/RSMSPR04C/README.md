# RSMSPR04C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T08:57:33.730Z  

```sql
/* Update your query here*/
alter table Orders add column discount real default 0;
select order_id, total_amount,discount from Orders limit 1;
```

---

[View on CodeChef](https://www.codechef.com/problems/RSMSPR04C)