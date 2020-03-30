package ch6;

public class Ch6_32 {
	public static void main(String[] args) {
		int wins = 0;
		
		for(int i = 0; i < 10000; i++) {
			if(craps())
				wins++;
		}
		
		System.out.print("The number of wins is " + wins);
	}
	
	/*
	 * return true if there is a win
	 */
	public static boolean craps() {
		
		int dice1 = rollDice();
		int dice2 = rollDice();
		
		int sum = dice1 + dice2;
		

		
		if(sum == 2 || sum == 3 || sum == 12) {
			return false;
		}
		
		else if(sum == 7 || sum == 11) {
			return true;
		}
		else {
			int points = sum;
			
			
			do {
				dice1 = rollDice();
				dice2 = rollDice();
				
				sum = dice1 + dice2;
			} while( sum != 7 && sum != points);
			

			
			if(sum == points)
				return true;
			else 
				return false;
				
		}
	}
	
	public static int rollDice() {
		return (int)(Math.random() * 6) + 1;
	}
}
