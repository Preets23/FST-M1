List1=[1,4,3,6,8,0]
List2=[5,6,3,2,1,9]
print("FirstList ",List1)
print("SecondList ",List2)
List3=[]
for number in List1:
    if(number%2!=0):
        List3.append(number)
for number in List2:
    if(number%2==0):
        List3.append(number)    
print("Final List ",List3)
