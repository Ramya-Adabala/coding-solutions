# RSMSPR04B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T04:49:18.728Z  

```sql
--Solution as follows

UPDATE Products
SET price = price * 1.10
WHERE category = 'Electronics';

SELECT name, price, stock_quantity
FROM Products 
WHERE category = 'Electronics'
LIMIT 1;

```

---

[View on CodeChef](https://www.codechef.com/problems/RSMSPR04B)