/* Write a query to do the following
- Set hourly_pay to 150 for HR employees
- Output the entire table
*/
update employee set hourly_pay=150 where department='Hr';
select *from employee;