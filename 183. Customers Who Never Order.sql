select name as Customers from Customers where id not in (select Customers.id from Customers INNER JOIN Orders on Customers.id = Orders.customerId);


# select name as Customers from Customers where id not in (select c1.id from Customers c1, Orders o1 where c1.id = o1.customerId);