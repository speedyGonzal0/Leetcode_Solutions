SELECT
  ura.accepter_id AS id,
  SUM(ura.acc_num) AS num
FROM (
SELECT * FROM 
  (
    SELECT 
    accepter_id,
    COUNT(*) AS acc_num
    FROM RequestAccepted GROUP BY accepter_id
  ) ra
  UNION ALL
  (
    SELECT 
    requester_id,
    COUNT(*) AS req_num
    FROM RequestAccepted GROUP BY requester_id
  )
) ura GROUP BY accepter_id ORDER BY num DESC LIMIT 1;