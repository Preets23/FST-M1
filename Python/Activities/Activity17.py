import pandas as pd
from pandas.core.indexes.base import Index

data={
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
dataframe=pd.DataFrame(data)
print(dataframe)
dataframe.to_csv("sample.csv",index=False)
