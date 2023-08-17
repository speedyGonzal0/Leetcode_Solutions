SELECT s.name FROM Orders o INNER JOIN Company c ON o.com_id = c.com_id AND c.name = 'RED' RIGHT JOIN SalesPerson s ON o.sales_id = s.sales_id WHERE c.name IS NULL;
