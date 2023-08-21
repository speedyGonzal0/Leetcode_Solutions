import pandas as pd

def find_patients(patients: pd.DataFrame) -> pd.DataFrame:
    return patients[patients['conditions'].str.contains('^DIAB1.*') | patients['conditions'].str.contains('^.* DIAB1[0-9]+')]