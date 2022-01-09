import pandas as pd
dataframe=pd.read_csv("Sample.csv")
print(dataframe)

print("Usernames")
print(dataframe["Usernames"])

print("Username and Password from row2")
print(dataframe["Usernames"][1]+ " " +dataframe["Passwords"][1])

print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))


