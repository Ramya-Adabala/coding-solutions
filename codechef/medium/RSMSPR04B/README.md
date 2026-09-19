# RSMSPR04B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task-4B Data Modification (Update and Alter)

Listen

Write queries for the following data modification operations based on the tables that we created and the data that we inserted.

### Task

Add a new column "discount" to the Orders table.
Set its default value to 0.
Then, retrieve the order_id, total_amount and discount of the first order from the Orders table.

### Expected output

```
┌──────────┬──────────────┬──────────┐
│ order_id │ total_amount │ discount │
├──────────┼──────────────┼──────────┤
│ 1001     │ 999.99       │ 0.0      │
└──────────┴──────────────┴──────────┘

```

### Tables
- Customers

```
┌─────────────┬─────────────┬──────────────────────┬────────────┬─────────────┐
│ customer_id │    name     │        email         │   phone    │   address   │
└─────────────┼─────────────┼──────────────────────┼────────────┼─────────────┘

```

- Products

```
┌────────────┬────────────────────┬─────────────┬────────┬────────────────┐
│ product_id │        name        │  category   │ price  │ stock_quantity │
└────────────┴────────────────────┴─────────────┴────────┴────────────────┘

```

- Orders

```
┌──────────┬─────────────┬────────────┬──────────────┬─────────────────┐
│ order_id │ customer_id │ order_date │ total_amount │ Remarks_if_any  │
└──────────┴─────────────┴────────────┴──────────────┴─────────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T08:57:31.545Z  

```sql
/* Update your query here*/
alter table Orders add column discount real default 0;
select order_id, total_amount,discount from Orders limit 1;
```

---

[View on CodeChef](https://www.codechef.com/problems/RSMSPR04B)