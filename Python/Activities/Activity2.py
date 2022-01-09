Number=int(input("Enter a number: "))
CheckNum = Number%2
if CheckNum == 0:
    txt="{} is even"
    print(txt.format(Number))
else:    
    txt="{} is odd"
    print(txt.format(Number))