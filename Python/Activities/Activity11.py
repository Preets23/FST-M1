fruits={"Grapes":30,"Banana":40,"Apple":25,"Papaya":20}
Checkfruit=input("Enter a fruit to check if available").lower()

if(Checkfruit in fruits):
    print("Yes, it is available")
else:
    print("No, this fruit is not availble")