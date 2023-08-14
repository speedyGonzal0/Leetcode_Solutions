import pandas as pd

def game_analysis(activity: pd.DataFrame) -> pd.DataFrame:
  new_act = activity.groupby(['player_id'])['event_date'].min().reset_index()
  return new_act.rename( columns = {'event_date': 'first_login'})