package ch5;

import java.util.Scanner;

public class Ch5_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String first = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		
		input.close();
		
		if(second.length() < first.length()) {
			String temp = first;
			first = second;
			second = temp;
		}
		
		int index = 0;
		for(int i = 0; i < first.length(); i++) {
			if(first.charAt(i) != second.charAt(i)) {
				index = i;
				break;
			}
		}
		
		if(index > 0) {
			System.out.println("The common prefix is: " + first.substring(0, index));
		}
		else {
			System.out.println(first + " and " + second + " have no common prefix");
		}
	}

}
