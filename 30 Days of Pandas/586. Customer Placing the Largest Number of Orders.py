import pandas as pd

def largest_orders(orders: pd.DataFrame) -> pd.DataFrame:

  new_ord = orders.groupby('customer_number')['order_number'].count().reset_index()

  return new_ord[ new_ord['order_number'] == new_ord['order_number'].max()][['customer_number']]