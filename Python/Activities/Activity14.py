
enterrange=int(input("Enter the range upto : "))
n1=0
n2=1
count=0
if(enterrange<=0):
    print("Enter a valid number")
elif(enterrange==1):
    print("Fibonacci sequence upto ",enterrange,"is ",n2)
else:
    print("Fibonacci sequence upto ",enterrange,"is ")
    while count< enterrange:
        print(n1)
        x=n1+n2
        n1=n2
        n2=x
        count=count+1


 