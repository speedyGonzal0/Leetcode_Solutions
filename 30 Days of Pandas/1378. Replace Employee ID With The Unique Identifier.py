import pandas as pd

def replace_employee_id(employees: pd.DataFrame, employee_uni: pd.DataFrame) -> pd.DataFrame:

    return employees.merge(employee_uni, how = 'left', left_on = 'id', right_on = 'id')[['unique_id', 'name']]
    