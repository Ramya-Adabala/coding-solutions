# TRA01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Understanding Transaction, Commit and Rollback

Listen

### What is a Transaction?

A transaction is like a package of database operations that belong together. Think of it as a to-do list where either everything gets done, or nothing does. For example, when you buy something online, the transaction might include: checking your balance, deducting money from your account, and updating the store's inventory. These steps must all succeed together for the purchase to be valid.

### What is a Commit?

A commit is like pressing the "Save" button on your changes. When you commit a transaction, you're telling the database "I'm sure about all these changes - make them permanent." It's similar to signing a contract - once you commit, the changes are officially recorded and can't be easily undone.

### What is a Rollback?

A rollback is like an "undo" button for your transaction. If anything goes wrong during your transaction (like a network error or insufficient funds), a rollback returns everything to how it was before the transaction started. It's similar to erasing everything you wrote on a page and starting fresh.

### What is a Savepoint

A SAVEPOINT is like placing multiple bookmarks while writing an important document. If you make a mistake, instead of erasing everything and starting over, you can go back to the last bookmark and continue from there.

#### Video Explanation:

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:14:38.371Z  

```sql

-- Create a sample table if it does not exist
CREATE TABLE IF NOT EXISTS Employees (
    EmpID INT,
    Name VARCHAR(50),
    Salary DECIMAL(10, 2)
);

-- Start a transaction
BEGIN TRANSACTION;

-- Insert a new employee
INSERT INTO Employees (EmpID, Name, Salary) VALUES (1, 'John Doe', 50000);

-- Create a savepoint
SAVEPOINT sp1;

-- Insert another employee
INSERT INTO Employees (EmpID, Name, Salary) VALUES (2, 'Jane Smith', 60000);

-- Create another savepoint
SAVEPOINT sp2;

-- Insert another employee
INSERT INTO Employees (EmpID, Name, Salary) VALUES (3, 'Jordan', 70000);

-- Create another savepoint
SAVEPOINT sp3;

-- Insert another employee
-- Assume that this record was repeatedly entred by mistake (as this already exists)
INSERT INTO Employees (EmpID, Name, Salary) VALUES (1, 'John Doe', 50000);

SELECT * FROM Employees;

-- Since the last INSERT was a mistake, rollback to the last savepoint (sp3)
ROLLBACK TO sp3;

.print "After rollback the transaction is removed"

-- Now commit the transaction
COMMIT;

-- Verify the data
SELECT * FROM Employees;

```

---

[View on CodeChef](https://www.codechef.com/problems/TRA01)