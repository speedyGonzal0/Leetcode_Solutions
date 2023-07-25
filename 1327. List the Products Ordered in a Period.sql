
SELECT product_name, unit FROM(
  SELECT
    p.product_name,
    SUM(o.unit) AS unit
    FROM Products p INNER JOIN Orders o ON p.product_id = o.product_id WHERE o.order_date < '2020-03-01' AND o.order_date > '2020-01-31' GROUP BY p.product_id, DATE_FORMAT(o.order_date, "%Y-%m")
) d WHERE unit >= 100;