import pandas as pd

def rearrange_products_table(products: pd.DataFrame) -> pd.DataFrame:
  # store1 = products[['product_id', 'store1']]
  # store1['store'] = 'store1'
  # store1 = store1.rename(columns = {'store1': 'price'})

  # store2 = products[['product_id', 'store2']]
  # store2['store'] = 'store2'
  # store2 = store2.rename(columns = {'store2': 'price'})

  # store3 = products[['product_id', 'store3']]
  # store3['store'] = 'store3'
  # store3 = store3.rename(columns = {'store3': 'price'})

  # new_prod = pd.concat([store1, store2, store3])
  # new_prod = new_prod.dropna(subset = ['price'])

  new_prod = pd.melt( products, id_vars = ['product_id'], var_name = 'store', value_name = 'price').dropna()
  return new_prod