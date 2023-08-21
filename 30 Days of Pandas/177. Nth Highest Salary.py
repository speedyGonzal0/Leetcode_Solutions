import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    new_emp = employee.sort_values('salary', ascending = False)
    new_emp = new_emp.drop_duplicates(subset = 'salary')
    new_emp = new_emp[['salary']].rename(columns = {'salary' : f'getNthHighestSalary({N})'})
    return new_emp[N - 1 : N]