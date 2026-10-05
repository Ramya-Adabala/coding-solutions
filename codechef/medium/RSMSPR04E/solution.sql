/* Update your query here*/
alter table Customers add column new_address default 'Unknown';
select name,address,new_address from customers limit 1;
