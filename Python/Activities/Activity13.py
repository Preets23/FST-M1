def sum(numbers):
    sum=0
    for number in numbers:
        sum=sum+number
    return sum

list=[4,3,2,1,6,8]
result=sum(list)   
print("Sum of all numbers from the list = ",(result))