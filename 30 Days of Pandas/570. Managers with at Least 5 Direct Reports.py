import pandas as pd

def find_managers(employee: pd.DataFrame) -> pd.DataFrame:
    new_emp = employee.groupby('managerId')['id'].count().reset_index()
    new_emp = new_emp[new_emp['id'] >= 5]
    return employee[employee['id'].isin( new_emp['managerId'])][['name']]