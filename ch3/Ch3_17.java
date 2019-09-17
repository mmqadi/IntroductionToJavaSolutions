package ch3;
import java.util.Scanner;
public class Ch3_17 {

	public static void main(String[] args) {
		int computer = (int)(Math.random() * 3);
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = in.nextInt();
		in.close();
		
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
		
		
		if(computer == 0) {
			if(user == 1)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". You won");
			else if(user == 2)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". Computer won");
			else 
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". It is a draw");
		}
		else if(computer == 1) {
			if(user == 2)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". You won");
			else if(user == 0)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". Computer won");
			else 
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". It is a draw");
		}
		
		else {
			if(user == 0)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". You won");
			else if(user == 1)
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". Computer won");
			else 
				System.out.print("The computer is " + compStr + ". You are " + userStr + ". It is a draw");
		}
	}

}
