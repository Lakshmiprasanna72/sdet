player1 = input("Enter First Player Name:")
player2 = input("Enter Second Player Name:")
player1_answer = input(player1 + "Do you want to choose Rock,Paper or Scissors?")
player2_answer = input(player2 + "Do you want to choose Rock,Paper or Scissors?")
if player1_answer == player2_answer:
          Print("Match Tied")
elif player1_answer == "rock" :
       if player2_answer == "scissor":
                    print("rock wins")
       else:
            print("paper wins")
	
elif player1_answer == 'scissors':
	
    if player2_answer == 'paper':
	
        print("Scissors win!")
	
    else:
	
        print("Rock wins!")
	
elif player1_answer == 'paper':
	
    if player2_answer == 'rock':
	
        print("Paper wins!")
	
    else:
	
        print("Scissors win!")
	
else:
	
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
