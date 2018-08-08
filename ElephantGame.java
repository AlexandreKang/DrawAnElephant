
public class ElephantGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// --------------------
		// Variable declaration
		// --------------------
		int dieRoll;
		// Data for player 1
		int player1Count = 0;
		int ear1 =0, leg1 = 0, tail1 = 0, body1 = 0, head1 = 0, trunk1 =0;
		// Data for player 2
		int player2Count = 0;
		int ear2 =0, leg2 = 0, tail2 = 0, body2 = 0, head2 = 0, trunk2 =0;
		int winner = 0; // 1 - player 1 is winner, 2 = player 2 is winner
		int round = 0;
		
		// --------
		// Header
		// --------
		System.out.print("---------------------------------------------------------\n"+
						"             Alex's Elephant Drawing Game\n" +
		
				"---------------------------------------------------------\n\n");
		do{
			round++;
			// Player 1 rolling die
			dieRoll = (int)(Math.random() *6 ) + 1;
			// Interpret die roll
			// ------------------
			if (dieRoll == 1) // trunk
			{
				if (head1 == 1 && trunk1 == 0) trunk1 = 1;
			}
			else if (dieRoll == 2) // head
			{
				if (body1 == 1) head1 = 1; // if have body can attach a
			}
			else if (dieRoll == 3) body1 = 1; // body
			else if (dieRoll == 4) // tail
			{
				if (body1 ==1) tail1 = 1; // if have body can attach a tail
			}
			else if (dieRoll == 5) // leg
			{
				if (body1 == 1 && leg1 < 4) leg1++;
			}
			else // ear
			{
				if (head1 == 1 && ear1 < 2 ) ear1++;
			}
			//Is player 1 a winner?
			if(body1 ==1 && head1 ==1 && trunk1 == 1 && tail1 == 1 && ear1 == 2 && leg1 == 4)
				winner =1;
			// If player 1 has not won, player 2 can throw dice.
			if (winner == 0)
			{
				// Player 1 rolling die
				dieRoll = (int)(Math.random() * 6 ) + 1;
				// Interpret die roll
				// ------------------
				if (dieRoll == 1) // trunk
				{
					if (head2 == 1 && trunk2 == 0) trunk2 = 1;
				}
				else if (dieRoll == 2) // head
				{
					if (body2 == 1) head2 = 1; // if have body can attach a
				}
				else if (dieRoll == 3) body2 = 1; // body
				else if (dieRoll == 4) // tail
				{
					if (body2 ==1) tail2 = 1; // if have body can attach a tail
				}
				else if (dieRoll == 5) // leg
				{
					if (body2 == 1 && leg2 < 4) leg2++;
				}
				else // ear
				{
					if (head2 == 1 && ear2 < 2 ) ear2++;
				}
				//Is player 2 a winner?
				if(body2 ==1 & head2 ==1 && trunk2 == 1 && tail2 == 1 && ear2 == 2 && leg2 == 4)
					winner = 2;
			}
			// Display status at the end of this round
			// ---------------------------------------
			System.out.print( "The status after round " + round +" is as follows: \n");
			if (winner == 0)
			{				
				System.out.println("Player 1's elephant has " + (body1 == 0?"no": "a") + " body, " + 
			                       (head1 == 0?"no": "a") + " head, "  + (ear1 == 0?"no":ear1) + " ear(s)," +
						           (trunk1 == 0?"no": "a")+ " trunk, " + (tail1 == 0? "no":"a") + " tail, and " +
			                       (leg1 == 0?"no": leg1) + " leg(s).");
				System.out.println("Player 2's elephant has " + (body2 == 0?"no": "a") + " body, " + 
	                       (head2 == 0?"no": "a") + " head, "  + (ear2 == 0?"no":ear2) + " ear(s)," +
				           (trunk2 == 0?"no": "a")+ " trunk, " + (tail2 == 0? "no":"a") + " tail, and " +
	                       (leg2 == 0?"no": leg2) + " leg(s).");
				System.out.println();
				
			}
			else
				System.out.println("Congratulations to player " + winner + "!!! Your elephant is complete!");
		}while (winner == 0);
		
		// Closing Message
		// ---------------
		System.out.println("\nHope you enjoyed drawing elephants!");
	}

}
