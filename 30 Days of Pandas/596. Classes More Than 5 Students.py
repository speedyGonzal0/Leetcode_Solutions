import pandas as pd

def find_classes(courses: pd.DataFrame) -> pd.DataFrame:
    counts = courses.groupby('class')['student'].count().reset_index()
    return counts[counts['student'] >= 5 ][['class']]