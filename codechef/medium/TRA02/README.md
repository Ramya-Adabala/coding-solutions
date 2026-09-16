# TRA02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Transaction, Commit and Rollback - Practice 6

Listen

You are managing a hotel booking system where a customer books  **two rooms in a single transaction**.

- The first booking is always successful, and then a second booking is added.
- If the customer decides to cancel only the second booking, we should remove it without affecting the first booking.

Fill in the missing transaction control commands  **(BEGIN TRANSACTION, SAVEPOINT, ROLLBACK, and COMMIT)**  in the given SQL query to ensure that the first booking remains safe, while the second booking can be rolled back if needed.
(Replace the ____ with the correct commands)

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:17:32.429Z  

```sql
-- Fill in the missing command to start the transaction
begin transaction;

-- Insert the first booking
INSERT INTO Bookings (CustomerID, RoomNumber, CheckInDate, CheckOutDate) 
VALUES (201, 101, '2025-06-01', '2025-06-05');

-- Fill in the missing command to create a savepoint
savepoint first_booking;

-- Insert the second booking
INSERT INTO Bookings (CustomerID, RoomNumber, CheckInDate, CheckOutDate) 
VALUES (201, 102, '2025-06-01', '2025-06-05');

-- If the customer decides to cancel the second booking, remove only that entry
rollback TO first_booking;

-- Finalize the transaction
commit;
```

---

[View on CodeChef](https://www.codechef.com/problems/TRA02)