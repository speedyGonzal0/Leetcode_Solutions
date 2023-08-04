import pandas as pd

def calculate_special_bonus(employees: pd.DataFrame) -> pd.DataFrame:
    employees.loc[(employees['employee_id'] % 2 == 0) | (employees['name'].str.startswith('M')), 'salary'] = 0
    new_emp = employees[['employee_id', 'salary']].sort_values('employee_id')
    new_emp = new_emp.rename(columns = {'salary': 'bonus'})
    return new_emp