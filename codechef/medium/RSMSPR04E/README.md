# RSMSPR04E

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T05:51:41.331Z  

```sql
/* Update your query here*/
alter table Customers add column new_address default 'Unknown';
select name,address,new_address from customers limit 1;

```

---

[View on CodeChef](https://www.codechef.com/problems/RSMSPR04E)