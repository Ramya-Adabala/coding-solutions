/* Update your query here*/
alter table Orders add column discount real default 0;
select order_id, total_amount,discount from Orders limit 1;