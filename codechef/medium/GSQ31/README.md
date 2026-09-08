# GSQ31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### NULL Values

Listen

Some rows / columns in databases can be empty - these values are treated as  **NULL**.
 **IS NULL**  and  **IS NOT NULL**  are used to filter for such entries.
Review the sample syntax below

```
select * from Flights
where origin IS NULL;

```

### Task

Write a query which meets the following conditions

- Passenger_id is blank or null
- Order by passenger_name

```
Expected output
┌──────────────┬────────────────┬────────┬─────────┬─────────────┐
│ Passenger_id │ Passenger_name │ Gender │ Origin  │ Destination │
├──────────────┼────────────────┼────────┼─────────┼─────────────┤
│ NULL         │ Dia            │ Female │ Beijing │ Mumbai      │
│ NULL         │ Roy            │ Male   │ London  │ Delhi       │
│ NULL         │ Salim          │ Male   │ Ohio    │ New York    │
└──────────────┴────────────────┴────────┴─────────┴─────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T12:55:19.094Z  

```sql
/* Write a query which meets the following conditions
- Passenger_id is blank or null
- Order by name
*/
select *from flights where Passenger_id is null order by passenger_name;

```

---

[View on CodeChef](https://www.codechef.com/problems/GSQ31)