SELECT q.person_name FROM (
    SELECT *,
    SUM(weight) OVER(ORDER BY turn) AS cweight 
 FROM Queue
) q WHERE q.cweight <= 1000 ORDER BY cweight DESC LIMIT 1;