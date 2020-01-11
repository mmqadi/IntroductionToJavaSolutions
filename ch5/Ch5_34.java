package ch5;

import java.util.Scanner;

public class Ch5_34 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		int userScore = 0;
		int computerScore = 0;
		
		do {
			int computer = (int)(Math.random() * 3);
			System.out.print("scissor (0), rock (1), paper (2): ");
			int user = in.nextInt();
			
			
			
			
			String userStr = "";
			String compStr = "";
			
			if(computer == 0)
				compStr = "scissor";
			if(computer == 1)
				compStr = "rock";
			if(computer == 2)
				compStr = "paper";
			
			if(user == 0)
				userStr = "scissor";
			if(user == 1)
				userStr = "rock";
			if(user == 2)
				userStr = "paper";
			
			if(computer == user)
				System.out.println("The computer is " + compStr + ". You are " + userStr + ". It is a draw");
			else if(computer == 0){
				if(user == 1) {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". You won this round.");
					userScore++;
				}
				else {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". Computer won this round");
					computerScore++;
				}
			}
			else if(computer == 1) {
				if(user == 2) {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". You won this round.");
					userScore++;
				}
				else {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". Computer won this round");
					computerScore++;
				}
			}
			
			else {
				if(user == 0) {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". You won this round.");
					userScore++;
				}
				else {
					System.out.println("The computer is " + compStr + ". You are " + userStr + ". Computer won this round");
					computerScore++;
				}
			}
			System.out.println("Score: C-" + computerScore + " U-" + userScore + " difference: " + Math.abs(computerScore - userScore));
		}
		
		while(Math.abs(computerScore - userScore) <= 2);
		
		in.close();
		String winner = (computerScore > userScore)?"Computer":"User";
		int winingScore = (computerScore > userScore)?computerScore:userScore;
		
		System.out.println();
		System.out.println("The winner is " + winner + " with a score of " + winingScore);
		
		
		
	}
}
