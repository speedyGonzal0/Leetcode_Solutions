import pandas as pd

def total_time(employees: pd.DataFrame) -> pd.DataFrame:
  employees['total_time'] = employees['out_time'] - employees['in_time']
  new_tt = employees.groupby(['emp_id', 'event_day'])['total_time'].sum().reset_index()
  return new_tt.rename( columns = { 'event_day' : 'day'})
    