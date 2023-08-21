import pandas as pd

def students_and_examinations(students: pd.DataFrame, subjects: pd.DataFrame, examinations: pd.DataFrame) -> pd.DataFrame:

    ex = examinations.groupby(['student_id', 'subject_name']).agg(attended_exams=('subject_name', 'count')).reset_index()

    ss = students.merge(subjects, how = 'cross')

    com = ex.merge(ss, how = 'right', on = ['student_id', 'subject_name'])

    com = com.fillna(0)

    com = com.sort_values(['student_id', 'subject_name'])

    return com[['student_id', 'student_name', 'subject_name', 'attended_exams']]