import pandas as pd

def count_rich_customers(store: pd.DataFrame) -> pd.DataFrame:
  new_store = store[store['amount'] > 500];
  new_store = new_store[['customer_id']].nunique()
  return pd.DataFrame( new_store, columns = ['rich_count'])
    