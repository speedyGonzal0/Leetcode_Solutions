import pandas as pd

def sales_person(sales_person: pd.DataFrame, company: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:

  ctable = orders.merge( company, how = 'inner', on = 'com_id' )
  inv_ids = ctable[ctable['name'] == 'RED']
  return sales_person[~sales_person['sales_id'].isin(inv_ids['sales_id'])][['name']]