  SELECT * FROM
  (
    SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product) AS products
    FROM Activities GROUP BY sell_date ORDER BY product
  ) a ORDER BY a.sell_date  ;