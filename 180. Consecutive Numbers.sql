SELECT DISTINCT num AS ConsecutiveNums FROM (
  SELECT *,
 num - LAG(num) OVER() AS prev_diff,
 num - LEAD(num) OVER () AS next_diff
  FROM Logs) d WHERE prev_diff = 0 AND next_diff = 0;