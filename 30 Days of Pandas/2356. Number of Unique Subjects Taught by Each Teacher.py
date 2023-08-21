import pandas as pd

def count_unique_subjects(teacher: pd.DataFrame) -> pd.DataFrame:
    grouped_teacher = teacher.groupby('teacher_id')
    return grouped_teacher['subject_id'].nunique().reset_index().rename(columns = {'subject_id': 'cnt'})