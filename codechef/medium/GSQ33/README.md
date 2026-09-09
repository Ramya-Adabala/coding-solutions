# GSQ33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Project - Distinct values

Listen

Write a query to output the distinct pin-codes from where orders have been received.

```
Expected output
┌─────────────────┐
│ address_pincode │
├─────────────────┤
│ 122001          │
│ 122002          │
│ 122003          │
│ 122004          │
└─────────────────┘

```

Your database is named 'Orders' and has the following columns

- order_id (INT)
- order_time (DOUBLE)
- customer_id (VARCHAR)
- customer_name (VARCHAR)
- address_pincode (INT)
- apartment_floor (INT)

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T01:03:11.264Z  

```sql
/* Write a query to output the distinct pin-codes from where orders have been received. */
select distinct address_pincode from orders ;
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ33)