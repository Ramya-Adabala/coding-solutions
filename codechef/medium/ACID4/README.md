# ACID4

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ACID Properties - Practice 4
#### Two customers are booking the last available seat on a flight at the same time.
#### Which ACID property ensures that only one of them successfully books the seat, preventing double booking?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:19:19.596Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ACID4)