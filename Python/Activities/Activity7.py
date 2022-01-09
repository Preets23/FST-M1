numbers=list(input("Enter a list of numbers separated by commas").split(','))
sum=0
for data in numbers:
    intdata=int(data)
    sum=sum+intdata
print(sum)