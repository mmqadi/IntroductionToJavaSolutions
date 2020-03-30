package ch6;

public class Ch6_30 {
	
	public static void main(String[] args) {
		craps();
	}
	
	public static void craps() {
		
		int dice1 = rollDice();
		int dice2 = rollDice();
		
		int sum = dice1 + dice2;
		
		System.out.println("you rolled " + dice1 + " + " + dice2 + " = " + sum);
		
		if(sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose");
		}
		
		else if(sum == 7 || sum == 11) {
			System.out.println("You win");
		}
		else {
			int points = sum;
			System.out.println("point is " + points);
			
			do {
				dice1 = rollDice();
				dice2 = rollDice();
				
				sum = dice1 + dice2;
			} while( sum != 7 && sum != points);
			
			System.out.println("you rolled " + dice1 + " + " + dice2 + " = " + sum);
			
			if(sum == points)
				System.out.println("You win");
			else 
				System.out.println("You lose");
				
		}
	}
	
	public static int rollDice() {
		return (int)(Math.random() * 6) + 1;
	}
}
