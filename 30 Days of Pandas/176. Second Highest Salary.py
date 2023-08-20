import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    uniq_sals = employee.sort_values(by = 'salary', ascending = False).drop_duplicates(subset = 'salary')
    return pd.DataFrame( {'SecondHighestSalary' : [None if uniq_sals['salary'].size < 2 else uniq_sals['salary'].iloc[1]]})