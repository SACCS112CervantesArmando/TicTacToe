import javax.swing.JOptionPane;

public class TicTacToeGame2 
{	
	public static void main(String[] args)
	{
		
		String player1Move;
		String player2Move;
		String [] TicTacToeArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int playCount = 0;
		boolean playAgain = true;
		
		while(playAgain)
		
		{
			
		
					TicTacToeArray[0], TicTacToeArray[1], TicTacToeArray[2],
					TicTacToeArray[3], TicTacToeArray[4], TicTacToeArray[5], 
					TicTacToeArray[6], TicTacToeArray[7], TicTacToeArray[8]);
				
			playCount++;
			
			
			switch(player1Move)
			{
				case "1": TicTacToeArray[0] = "X";
				break;
				case "2": TicTacToeArray[1] = "X";
				break;
				case "3": TicTacToeArray[2] = "X";
				break;
				case "4": TicTacToeArray[3] = "X";
				break;
				case "5": TicTacToeArray[4] = "X";
				break;
				case "6": TicTacToeArray[5] = "X";
				break;
				case "7": TicTacToeArray[6] = "X";
				break;
				case "8": TicTacToeArray[7] = "X";
				break;
				case "9": TicTacToeArray[8] = "X";
				break;
			}
			
			// check if player1 has won
			if((TicTacToeArray[0] == "X" && TicTacToeArray[0] == TicTacToeArray[1] && TicTacToeArray[1] == TicTacToeArray[2]) 
					|| (TicTacToeArray[3] == "X" && TicTacToeArray[3] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[5]) 
					|| (TicTacToeArray[6] == "X" && TicTacToeArray[6] == TicTacToeArray[7] && TicTacToeArray[7] == TicTacToeArray[8]) 
					|| (TicTacToeArray[0] == "X" && TicTacToeArray[0] == TicTacToeArray[3] && TicTacToeArray[3] == TicTacToeArray[6]) 
					|| (TicTacToeArray[1] == "X" && TicTacToeArray[1] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[7]) 
					|| (TicTacToeArray[2] == "X" && TicTacToeArray[2] == TicTacToeArray[5] && TicTacToeArray[5] == TicTacToeArray[8])
					|| (TicTacToeArray[0] == "X" && TicTacToeArray[0] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[8]) 
					|| (TicTacToeArray[2] == "X" && TicTacToeArray[2] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[6]))
				{
					JOptionPane.showMessageDialog(null, "Player 1 Wins!");
					break;
				}
			
			// End game if 9 plays have been made
			if(playCount == 9)
				{
					JOptionPane.showMessageDialog(null, "It's a tie!");
					break;
				}
			
			// Player B input dialog message
					TicTacToeArray[0], TicTacToeArray[1], TicTacToeArray[2],
					TicTacToeArray[3], TicTacToeArray[4], TicTacToeArray[5], 
					TicTacToeArray[6], TicTacToeArray[7], TicTacToeArray[8]);
			
			playCount++;
			
			switch(player2Move)
			{
			}

			// Check to see if player2 has won
			if((TicTacToeArray[0] == "O" && TicTacToeArray[0] == TicTacToeArray[1] && TicTacToeArray[1] == TicTacToeArray[2]) 
					|| (TicTacToeArray[3] == "O" && TicTacToeArray[3] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[5]) 
					|| (TicTacToeArray[6] == "O" && TicTacToeArray[6] == TicTacToeArray[7] && TicTacToeArray[7] == TicTacToeArray[8]) 
					|| (TicTacToeArray[0] == "O" && TicTacToeArray[0] == TicTacToeArray[3] && TicTacToeArray[3] == TicTacToeArray[6]) 
					|| (TicTacToeArray[1] == "O" && TicTacToeArray[1] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[7]) 
					|| (TicTacToeArray[2] == "O" && TicTacToeArray[2] == TicTacToeArray[5] && TicTacToeArray[5] == TicTacToeArray[8])
					|| (TicTacToeArray[0] == "O" && TicTacToeArray[0] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[8]) 
					|| (TicTacToeArray[2] == "O" && TicTacToeArray[2] == TicTacToeArray[4] && TicTacToeArray[4] == TicTacToeArray[6]))
			{
				JOptionPane.showMessageDialog(null, "Player 2 Wins!");
				playAgain = false;
			}		
		}
	}
}
