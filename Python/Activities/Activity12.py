def sum(n):
    if(n>=1):
        return n +sum(n-1)
    else:
        return 0
num=sum(10)
print(num)