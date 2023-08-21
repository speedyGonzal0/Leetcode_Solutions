import pandas as pd

def department_highest_salary(employee: pd.DataFrame, department: pd.DataFrame) -> pd.DataFrame:
  employee = employee.rename(columns={'name':'Employee', 'salary':'Salary'})
  department = department.rename(columns={'name':'Department'})
  dept_max = employee.merge(department, left_on='departmentId', right_on='id', how='outer')
  dept_max = dept_max.groupby('departmentId').apply(lambda x: x[x.Salary == x.Salary.max()])

  return pd.DataFrame(dept_max)[['Department', 'Employee', 'Salary']]