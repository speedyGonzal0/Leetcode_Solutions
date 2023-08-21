# SELECT 
#     s.id,
#     CASE
#         WHEN s.id % 2 != 0 AND nxt_stu IS NOT NULL THEN REPLACE(s.student, s.student, nxt_stu)
#         WHEN s.id % 2 != 0 AND nxt_stu IS NULL THEN s.student
#         ELSE REPLACE(s.student, s.student, prev_stu)
#     END AS student
# FROM Seat s
# INNER JOIN 
# (
#     SELECT *,
#     LEAD(student) OVER() AS nxt_stu
#     FROM Seat
# ) n ON s.id = n.id
# INNER JOIN 
# (
#     SELECT *,
#     LAG(student) OVER() AS prev_stu
#     FROM Seat
# ) p ON s.id = p.id;


SELECT
    CASE
        WHEN id % 2 != 0 AND id < (SELECT COUNT(*) FROM Seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        ELSE id
    END AS id,
    student
FROM Seat ORDER BY id;