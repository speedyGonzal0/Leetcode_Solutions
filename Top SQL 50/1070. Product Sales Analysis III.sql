SELECT s1.product_id, s1.year AS first_year, s1.quantity, s1.price 
FROM Sales s1 
INNER JOIN
(
SELECT
  product_id, MIN(year) AS min_year
  FROM Sales
  GROUP BY product_id
)
c ON s1.product_id = c.product_id AND s1.year = c.min_year;