

  SELECT d.product_id, 
    IF(ocd.new_price IS NULL, 10, ocd.new_price) AS price
   FROM
  (SELECT * FROM Products WHERE change_date > '2019-08-16' AND product_id NOT IN (SELECT DISTINCT product_id FROM Products WHERE change_date <= '2019-08-16' GROUP BY product_id) GROUP BY product_id) lcd RIGHT JOIN (SELECT DISTINCT product_id FROM Products) d ON d.product_id = lcd.product_id
  LEFT JOIN (
      SELECT * FROM (
      SELECT *,
    FIRST_VALUE(change_date) OVER(PARTITION BY product_id ORDER BY change_date DESC) AS max_date
    FROM Products WHERE change_date <= '2019-08-16'
    ) od WHERE od.change_date = od.max_date
    
  ) ocd ON d.product_id = ocd.product_id;