/* Write a query to create a table employee with the mentioned constraints on the columns : 
employee_id - PRIMARY KEY, 
employee_Name -UNIQUE, 
department -NOT NULL CHECK (department IN ('Sales', 'Finance', 'Operations')) */

create table employee(
employee_id integer primary key,
employee_Name text UNIQUE,
department text not null check(department in ('Sales','Finance','Operations'))
);