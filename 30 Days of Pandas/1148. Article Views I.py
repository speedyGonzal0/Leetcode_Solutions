import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    new_av = views[ (views['author_id'] == views['viewer_id']) ]
    new_av = pd.DataFrame({'id' : new_av.author_id.unique()})
    new_av = new_av.sort_values('id')
    return new_av