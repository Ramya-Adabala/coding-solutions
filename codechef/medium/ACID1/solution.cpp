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