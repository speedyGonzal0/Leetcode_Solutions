
SELECT name AS results FROM (
  SELECT u.user_id,
  u.name,
  COUNT(*) as no_of_ratings
FROM MovieRating mr INNER JOIN Users u ON mr.user_id = u.user_id GROUP BY u.user_id ORDER BY no_of_ratings DESC, u.name LIMIT 1
) un

UNION ALL

SELECT title AS results FROM(
  SELECT m.movie_id,
    m.title,
    AVG(mr.rating) AS avg_rating
  FROM MovieRating mr INNER JOIN Movies m ON mr.movie_id = m.movie_id WHERE mr.created_at > DATE('2020-01-31') AND  mr.created_at < DATE('2020-03-01') GROUP BY m.movie_id ORDER BY avg_rating DESC, m.title LIMIT 1
) mn
;