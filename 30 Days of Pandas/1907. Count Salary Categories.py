import pandas as pd

def count_salary_categories(accounts: pd.DataFrame) -> pd.DataFrame:
    low_sals = accounts[accounts['income'] < 20000]['income'].count()
    avg_sals = accounts[(accounts['income'] >= 20000) & (accounts['income'] <= 50000)]['income'].count()
    high_sals = accounts[accounts['income'] > 50000]['income'].count()
    return pd.DataFrame( {'category': ['Low Salary', 'Average Salary', 'High Salary'], 'accounts_count': [low_sals, avg_sals, high_sals]})