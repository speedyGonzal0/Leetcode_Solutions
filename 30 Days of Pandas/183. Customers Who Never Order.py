import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:

    new_cus = customers.merge( orders, how = 'left', left_on = 'id', right_on = 'customerId')
    new_cus = new_cus[ new_cus['customerId'].isna() ]
    new_cus.rename( columns={ 'name': 'Customers'}, inplace=True)    
    return new_cus[['Customers']]