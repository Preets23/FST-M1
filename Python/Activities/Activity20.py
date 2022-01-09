import pandas as pd

dataframe=pd.read_excel("Sample.xlsx")
print(dataframe)

print("Number of Rows and columns")
print(dataframe.shape)

print("Email column")
print(dataframe['Email'])

print("FirstName sorted")
print(dataframe.sort_values('FirstName'))