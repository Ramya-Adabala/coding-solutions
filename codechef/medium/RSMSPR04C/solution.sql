/* Update your query here*/
update Products set stock_quantity=0 where stock_quantity=10;
select *from Products where stock_quantity=0;