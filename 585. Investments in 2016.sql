SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016 FROM (
  SELECT i1.tiv_2016 FROM Insurance i1 
  JOIN
  Insurance i2
  WHERE i1.pid != i2.pid 
    AND i1.tiv_2015 = i2.tiv_2015
    AND CONCAT(i1.lat, i1.lon) NOT IN 
    (
      SELECT CONCAT(lat, lon) FROM Insurance WHERE pid != i1.pid
    )
  GROUP BY i1.pid
) d;