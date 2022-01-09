Player1 =input("Enter Player1 name : ")
player2 = input("Enter Player2 name:")

entry1 = input("Player 1 selects(Rock or Paper or Scissors)")
entry2=input("Player 2 selects(Rock or Paper or Scissors)")

if entry1==entry2:
    {
    print("It is a tie")
    }

elif entry1=="Rock": 
    if entry2=="Scissors":
        print("Rock wins")
    else:
        print("Paper wins")
elif entry1=="Scissors": 
    if entry2=="Paper":
        print("Scissor wins")
    else:
        print("Rock wins")
elif entry1=="Paper": 
    if entry2=="Rock":
        print("Paper wins")
    else:
        print("Scissors wins")
else:
    print("Wrong choice. Choose either Rock or Paper or Scissors")