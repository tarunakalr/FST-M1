player1 = input("Player 1 - What is your selection?").lower()

player2 = input("Player 2 - what is your selection?").lower()

if player1 == player2:
    Print("Tie")
elif player1== "rock":
    if player2=="paper" :
        print("paper wins") 
    else:
        print ("rock wins")
elif player1 == "paper":
    if player2 =="rock":
        print("paper wins")
    else:
        print("scissors wins")
elif player1 =="scissors":
    if player2=="rock":
        print("rock wins")
    else:
        print("scissors wins")  
else:
    print("invalid input")          

                       
