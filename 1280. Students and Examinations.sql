SELECT
 ss.student_id,
 ss.student_name,
 ss.subject_name,
 IFNULL(COUNT(e.subject_name), 0) AS attended_exams
FROM Examinations e 
RIGHT JOIN (SELECT * FROM Students, Subjects) ss
ON e.student_id = ss.student_id AND e.subject_name = ss.subject_name
GROUP BY ss.student_id, ss.subject_name
ORDER BY ss.student_id
;