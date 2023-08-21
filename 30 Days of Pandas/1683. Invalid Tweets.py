import pandas as pd

def invalid_tweets(tweets: pd.DataFrame) -> pd.DataFrame:
    new_twt = tweets[ (tweets['content'].str.len() > 15) ]
    new_twt = new_twt[['tweet_id']]
    return new_twt